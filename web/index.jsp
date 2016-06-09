<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="CSS/login/demo.css" />
        <link rel="stylesheet" type="text/css" href="CSS/login/style.css" />
        <link rel="stylesheet" type="text/css" href="CSS/login/animate-custom.css" />
        <script type="text/javascript" src="JS/javascript1.js"></script>
    </head>
    <body>
        <div class="container">
            <!-- Codrops top bar -->
            <div class="codrops-top">
                <div class="clr"></div>
            </div><!--/ Codrops top bar -->
            <header>
            </header>
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form name="form_login" action="inicial" method="POST">
                                <h1>Oficina de Motos</h1> 
                                <p> 
                                    <label for="username" class="uname" data-icon="u" > Usuario </label>
                                    <input type="text" name="usuario" value="" size="25" /><br/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Senha </label>
                                    <input type="password" name="senha" value="" size="25" /><br/> 
                                </p>
                                <p class="login button"> 
                                    <input type="submit" value="Logar" name="btEnviar" /> 
                                </p>
                            </form>
                </div>
                    </div>
                </div>
            </section>
        </div>
    </body>
</html>