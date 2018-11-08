
/**
 * Class Repository
 *
 *    ->   Repository(String RepositoryDirectoryPath )
 * 
 *    ->   Repository(String RepositoryDirectoryPath , Boolean OverwriteState )
 * 
 *    ->   void setRepositoryPath(String RepositoryDirectoryPath)
 *    ->   void setCurrentFilePath(String CurrentFileName)
 *    ->   void setOverwriteState(boolean OverwriteState)
 * 
 *    ->   String getRepositoryPath()
 *    ->   String getCurrentFilePath()
 *    ->   boolean getOverwriteState()
 * 
 *    ->   void checkPaths() throws RepositoryException
 * 
 *    ->   void useFile(String CurrentFileName)
 *    ->   void createFile(String CurrentFileName)
 *    ->   boolean searchLine(BufferedReader buff , String regex , List<String> result , boolean negation)
 *    ->   ArrayList<String> select(String regex)
 *    ->   void insert(String ins , int ...lineNo)
 *    ->   boolean delete(String regex)
 * 
 */

package contact.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.*;
import java.util.ArrayList;
import java.io.IOException;

import contact.extra.Console;
import contact.exception.RepositoryException;
import contact.exception.ErrorCode;


public class Repository
{
    private String repositoryDirectoryPath;

    private String currentFilePath;

    private File currentFile;

    private boolean overWriteFiles;

    public Repository(String RepositoryDirectoryPath )
    {
        this.repositoryDirectoryPath = RepositoryDirectoryPath;
    }

    public Repository(String RepositoryDirectoryPath , Boolean OverwriteState )
    {
        /*
            Sets the RepositoryDirectoryPath

            Optional Sets OverWriteFiles

        */

        this.setRepositoryPath(RepositoryDirectoryPath);
        
        this.overWriteFiles = OverwriteState;
        
    }

    // SETTERS
  
    public void setRepositoryPath(String RepositoryDirectoryPath){

        this.repositoryDirectoryPath = RepositoryDirectoryPath;
    }

    public void setCurrentFilePath(String CurrentFileName)
    {
        currentFilePath = this.repositoryDirectoryPath +  CurrentFileName;

    }

    public void setOverwriteState(boolean OverwriteState){
        
        this.overWriteFiles = OverwriteState; 
    }

    // GETTERS

    public String getRepositoryPath(){

        return this.repositoryDirectoryPath;
    }
    
    public String getCurrentFilePath(){

        return this.currentFilePath;
    }

    public boolean getOverwriteState(){
    
        return this.overWriteFiles; 
    }

    // OTHER

    public void checkPaths() throws RepositoryException
    {
        if(this.getRepositoryPath() == null)
        {
            throw new RepositoryException(ErrorCode.DIRECTORY_PATH_NOT_SET);
        }
        else if(this.getCurrentFilePath() == null)
        {
            throw new RepositoryException(ErrorCode.FILE_PATH_NOT_SET);
        }

    }

    public void useFile(String CurrentFileName)
    {
        /*
            Sets the currentFilePath
        
            Sets the currentFile

            throws Exception if given file path is a directory or if file does not exists.
        */
        

        try
        {
            this.setCurrentFilePath(CurrentFileName);

            this.currentFile = new File(this.currentFilePath);

          
            if(!currentFile.exists())
            {
                throw new RepositoryException("File Does not Exist " + this.currentFilePath);
            }

            if(this.currentFile.isDirectory())
            {
                throw new RepositoryException("Directory Given Instead Of File" + this.currentFilePath);
            }
        }
        catch(RepositoryException exception)
        {
            Console.log(exception);
            Console.newLine();
        }
    }
 
    public void createFile(String CurrentFileName)
    {
        /*
            Creates a new File if file does not exists or Overwrite Files if overWriteFiles is set to true;

        */

        File createFile = null;

        try
        {
            createFile = new File(this.repositoryDirectoryPath + CurrentFileName);
       
            if(!createFile.exists())
            {
                createFile.createNewFile();
            }
            else
            {
                this.setCurrentFilePath(CurrentFileName);
           
                if(this.getOverwriteState())
                {
                    if(createFile.delete())
                    {
                        createFile.createNewFile();
                    }
                    else
                    {
                        throw new Exception("Cannot Delete File " + this.currentFilePath);
                    }
                }
                else
                {
                    this.useFile(CurrentFileName);

                    throw new IOException("OverwriteFiles is Set to false Cannot Delete file " + this.currentFilePath);
                }
            }
        }
        catch(Exception exception)
        {
            Console.log(exception);
            Console.newLine();
        }

        
    }

    public boolean searchLine(BufferedReader buff , String regex , ArrayList<String> result , boolean negation)
    {
        String fileLine = null;

        Pattern searchLine = null;

        boolean success = false;

        try {

            searchLine = Pattern.compile(regex);
                
            if(negation)
            {
                while((fileLine = buff.readLine()) != null)
                {
                    if(!searchLine.matcher(fileLine).find())
                    {
                        result.add(fileLine);
                    }
                    else
                    {
                        success = true;
                    }
                }
            }
            else
            {
                while((fileLine = buff.readLine()) != null)
                {
                    if(searchLine.matcher(fileLine).find())
                    {
                        success = true;
                        
                        result.add(fileLine);
                    }
                }
            }
            
            
        } catch (Exception exception) {
            
            Console.log(exception);
        }

        return success;
    }

    public ArrayList<String> select(String regex)
    {
        /*

            Get all lines matching the register expression regex 

            and stores them in resultArray and returns it;

        */

        ArrayList<String> resultArray=null;

        BufferedReader bufferedReader = null;
  

        
        try {

            this.checkPaths();

            resultArray = new ArrayList<>();
       
            bufferedReader = new BufferedReader(new FileReader(this.currentFile));

            this.searchLine(bufferedReader , regex , resultArray , false);

            bufferedReader.close();
            
        } catch (Exception exception) {
            
            Console.log(exception);
        }

        return resultArray;
    }

    public boolean insert(String ins , int ...lineNo)
    {
        /*
            Will Later look on how to implement on writing in a specified Line

        */
        boolean success = false;

        BufferedWriter bufferedWriter = null;
      
        try {

            this.checkPaths();
            
            bufferedWriter = new BufferedWriter(new FileWriter(this.currentFile ,true));
   
            bufferedWriter.write(ins);

            bufferedWriter.newLine();

            

            bufferedWriter.close();
          
        } catch (Exception exception) {
            
            Console.log(exception);
        }

        return success;
    }

    public boolean delete(String regex)
    {
        ArrayList<String> resultArray = null;

        boolean success = false;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        
        try {

            this.checkPaths();

            resultArray = new ArrayList<>();

            bufferedReader = new BufferedReader(new FileReader(this.currentFile));
            
            success = this.searchLine(bufferedReader, regex, resultArray, true);

            bufferedWriter = new BufferedWriter(new FileWriter(this.currentFile));
 
            for(String line : resultArray)
            {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();
            
        } catch (Exception exception) {

            Console.log(exception);
        }

        return success;

    }

    public boolean update(String regex , String value)
    {
        boolean success = false;

        ArrayList<String> resultArray = null;
  
        String fileLine = null;

        Pattern searchLine =  null;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            resultArray = new ArrayList<>();

            searchLine = Pattern.compile(regex);

            bufferedReader = new BufferedReader(new FileReader(this.currentFile));

            while((fileLine = bufferedReader.readLine()) != null)
            {
                if(searchLine.matcher(fileLine).find())
                {
                    success = true;

                    resultArray.add(value);
                }
                else
                {
                    resultArray.add(fileLine);
                }
            } 

            bufferedWriter = new BufferedWriter(new FileWriter(this.currentFile));

            for(String s : resultArray)
            {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();
       

        } catch (Exception exception) {

            Console.log(exception);

        }

        return true;
    }

}