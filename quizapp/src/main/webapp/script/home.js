
const LOGIN_ERROR = 1001;
const REGISTER_ERROR_USERNAME = 1002;
const REGISTER_ERROR_EMAIL = 1003;
const REGISTER_ERROR_OTHER = 1004;
const REGISTER_ERROR_EMPTY_FIELDS = 1005;
const ANSWER_PAGE_ERROR = 1006;
const QUESTION_OVER_ERROR = 1007;

function getQuestion() {

    $.ajax({

        url:"question" ,

        type:"GET" ,
        
        data:{button:"clicked"} ,

        success:function(result) {

           for(let rs in result) {

                if(rs != "id") {

                    console.log(rs);

                    $("#questionBox").html("<h5>" + rs + "</h5>");

                    $('#optionBox').html("");

                    $('#optionBox').append("<form id='answerForm'></form>");

                    let i = 0;

                    for(let option of result[rs]) {

                        $('#optionBox form').append(`

                            <div class="optionsContainer">
                                <input type="radio" name="answer" value="${option}">${option}
                                </input>
                            </div>
                        `);

                        i++;
                    }

                    
                }
           }
        } ,

        error : function(result) {


        }
    })
}


function addProfile(result) {

    $(".profileCard")[0].style="display:block";

    $("#profileName").html(result.name);
    $("#profileEmail").html(result.email);
    $("#profileUsername").html(result.username);

    console.log(result);

    $("#logoutBtn").on( "click", function() {

        $.ajax(

            {
                url : "logout" ,

                type : "POST" ,

                success:function(result) {

                    window.location = result;
                }
            }
        )
    
    });
}

function removeProfile() {

    $(".profileCard")[0].style="display:none";
}

function __init__() {

    $.ajax({

        url:"home" , 

        type:"POST" ,

        success:function(result , textStatus , xhr) {

            if(result.status) {

                removeProfile();
            }
            else {

                addProfile(result);
                
            }
        } , 

        error:function(jqXHR, textStatus, errorThrown) {

            if(jqXHR.status = LOGIN_ERROR) {

                // do something
            }
        }
    });
}

$(document).ready(()=>{

    __init__();

    $("#showRegisterBtn").click(()=>{

        $(".registerForm").show();
        $(".loginForm").hide();
    });

    $("#showLoginBtn").click(()=>{

        $(".loginForm").show();
        $(".registerForm").hide();
    });

    $("#skipQuestionBtn").click(()=>{

        $.ajax({

            url:"answer" ,

            type:"GET" , 

            data:{button:"true"} ,

            statusCode: {

                1007:function() {

                    alert("Completed");
                }
            } 

        });
        
        getQuestion();
        
    });

    $("#nextQuestionBtn").click(()=>{

        let answer = $('input[name=answer]:checked', '#answerForm').val()

        $.ajax({

            url:"answer" ,

            type:"GET" , 

            data:{answer:answer,button:"true"} ,

            success:function(result) {

               $("#profileScore").html(result.score);
            } ,

            statusCode: {

                1007:function() {

                    alert("Completed");
                }
            } ,


        });

        getQuestion();
    });

    $("#loginUserBtn").click(()=>{

        let username = $("#lusername").val();
        let password = $("#lpassword").val();

        $.ajax({

            url : "login" ,

            success :function(result) {

                $(".container")[0].style="display:block"
                $(".container")[1].style="display:none"
                addProfile(result);
                getQuestion();
            } ,

            statusCode: {

                1001:function(){

                    alert("Invalid/Username Password");
                }

            } ,


            type:"POST" , 

            data:{username:username , password:password}

        });
    });

    $("#registerUserBtn").click(()=>{

        let name = $("#name").val();
        let email = $("#email").val();
        let username = $("#username").val();
        let password = $("#password").val();

        $.ajax(
            {
                url:"register" , 
                
                success:function(result , textStatus , xhr) {
                    
                    console.log(xhr.status);

                   $(".container")[0].style="display:block"
                   $(".container")[1].style="display:none"
                   addProfile(result);
                   getQuestion();
                } , 
                
                error: function(jqXHR, textStatus, errorThrown) {
                    
                    if(jqXHR.status == 1002) {

                        alert("Username already Exists");
                    }
                    else if(jqXHR.status == 1003) {

                        alert("Email is already Registered");
                    }
                    else if(jqXHR.status = 1005) {

                        alert("Empty Fields ");
                    }
                } ,

                type: "POST",
                
                data: {name : name , email : email , username : username , password : password}
            });

    });

    $("#aboutBtn").click(()=>
    {
        $("#aboutModal").modal();
    });

    $("#helpBtn").click(()=>
    {
        $("#helpModal").modal();
    });

})

