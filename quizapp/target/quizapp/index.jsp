<!DOCTYPE html>
<html>

<head>

    <meta name="viewport" content="device-width , initial-scale=1" />
    <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/animate/animate.css" rel="stylesheet" type="text/css"/>
    <link href="css/home.css" rel="stylesheet" type="text/css" />

    <script src="script/jquery/jquery-3.3.1.min.js" type="text/javascript"></script>
    <script src="script/popper/popper.min.js" type="text/javascript"></script>
    <script src="script/bootstrap/bootstrap.min.js" type="text/javascript"></script>
    <script src="script/home.js"></script>

    <title>QuizApp</title>

</head>

<body>



    <div class="vertical-center">


        <!--Main Bootstrap Container Starts-->

        <div class="menuContainer">

            <span id="menuShow">...</span>

            <div class="menu">

                <div class="menu-container">
                   
                    <span id="helpBtn" class="spanBtn bounce" title="Help" ></span>
                    <span id="aboutBtn" class="spanBtn" title="About"></span>

                    <div class="card profileCard" style="width: 10rem;">
           
                        <img class="card-img-top" src="resources/quiz.jpeg" alt="Card image cap">
                           
                        <div class="card-body">
                            <h4 class="card-title" id="profileName"></h4>
                            <p  id="profileEmail"></p>
                            <p  id="profileUsername"></p>
                            <code id="profileScore">0</code>
                        </div>
                
                        <div class="card-footer">
                            <button class="btn" id="logoutBtn">Logout</button>
                        </div>
                    </div>
                </div>

            </div>

        </div>



        <!---About Modal starts-->

        <div class="modal fade" id="aboutModal" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    
                    <div class="modal-header">
                        <h4 class="modal-title">About</h4>
                    </div>
                    
                    <div class="modal-body">
                        Modal content
                    </div>

                    <div class="modal-footer">
                   
                        <button type="button" class="btn btn-default" data-dismiss="modal">
                            Close
                        </button>
                   
                    </div>
                </div>
            </div>
        </div>

        <!---Abou Modal ends-->


        <!---Help Modal starts-->

        <div class="modal fade" id="helpModal" tabindex="-1" role="dialog">

            <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        
                        <div class="modal-header">
                            <h4 class="modal-title">Help</h4>
                        </div>
                        
                        <div class="modal-body">
                            Modal content
                        </div>
    
                        <div class="modal-footer">
                       
                            <button type="button" class="btn btn-default" data-dismiss="modal">
                                Close
                            </button>
                       
                        </div>
                    </div>
            </div>
        </div>
    
        <!---Help Modal ends-->


        <!-- Question Container Starts-->

            
        <div class="container" 

        <% if(session.getAttribute("user") != null) { %>  style="display:block" <% } %> 
        >
        
            <div class="row"  style="vertical-align:center">

                  <div class="col-*-*" id="questionContainer">

                    <header>


                    </header>

                    <div id="questionBox">

                        <h4></h4>

                    </div>

                    <div id="optionBox">

                    </div>

                    <footer>

                        <div id="questionControl">
                            <button class="btn" id="skipQuestionBtn">Skip</button> 
                            <button class="btn" id="nextQuestionBtn">Next</button>
                        </div>

                    </footer>

                </div>

              
            </div>

        </div>

        <!-- Question Container Ends-->

        <!-- Home Container Starts -->

        <div class="container" 
        
        <% if(session.getAttribute("user") == null) { %>  style="display:block" <% } %> 
        
        >

            <div class="alert alert-success alert-dismissible">
                    
                <button type="button" class="close" data-dismiss="alert">&times;</button>
                <strong>Sigin In or Register</strong>  to Continue Playing this Game....

            </div>
                      

            <div class="row">

                <div class="col-*-* FormContainer">

                    <!-- LOGIN FORM - Displayed By Default -->

                    <div id="backgroundBoxContainer">

                        <div class="backgroundBox"></div>

                    </div>

                    <form class="loginForm">

                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="username" id="lusername" name="username">
                        </div>

                        <div class="form-group">
                            <input type="password" placeholder="password" class="form-control" id="lpassword" name="lpassword">
                        </div>

                        <div class="form-group form-check">
                            <label class="form-check-label">
                                <input class="form-check-input" type="checkbox"> Remember me
                            </label>
                        </div>

                        <hr />
                        <button type="button" class="btn btn-dark" id="loginUserBtn">Sign In</button>
                        <p class="Or">Or</p>
                        <button type="button" class="btn btn-light" id="showRegisterBtn">Register</button>

                    </form>

                    <!-- Login Form Ends -->

                    <!-- REGISTER FORM - HIDDEN By Default -->

                    <form class="registerForm" method="POST">

                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="name" id="name" />
                        </div>

                        <div class="form-group">
                            <input type="email" class="form-control" placeholder="email" id="email" />
                        </div>


                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="username" id="username" />
                        </div>


                        <div class="form-group">
                            <input type="password" class="form-control" placeholder="password" id="password" />
                        </div>


                        <hr />
                        <button type="button" class="btn btn-dark" id="registerUserBtn">Create Account</button>
                        <p class="Or">Or</p>
                        <button type="button" class="btn btn-light" id="showLoginBtn">Sign In</button>

                    </form>

                    <!--REGISTER FORM ENDS-->

                </div>

            </div>

        <!-- Home Container Starts -->

            <!--Footer Starts-->

            <footer class="row">


            </footer>

            <!-- Footer Ends -->

        </div>

        <!--Main Bootstrap Container Ends-->

    </div>

</body>


</html>