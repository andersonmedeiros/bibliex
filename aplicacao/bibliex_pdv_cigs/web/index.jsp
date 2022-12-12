<%-- 
    Document   : index
    Created on : 10 de dez de 2022, 19:32:39
    Author     : STI
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="Anderson de Paula Andrade Medeiros">

        <title>PDV - LOGIN</title>

        <link rel="stylesheet" type="text/css" href="assets/node_modules/bootstrap/compiler/bootstrap.css">
        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }

            .b-example-divider {
                height: 3rem;
                background-color: rgba(0, 0, 0, .1);
                border: solid rgba(0, 0, 0, .15);
                border-width: 1px 0;
                box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
            }

            .b-example-vr {
                flex-shrink: 0;
                width: 1.5rem;
                height: 100vh;
            }

            .bi {
                vertical-align: -.125em;
                fill: currentColor;
            }

            .nav-scroller {
                position: relative;
                z-index: 2;
                height: 2.75rem;
                overflow-y: hidden;
            }

            .nav-scroller .nav {
                display: flex;
                flex-wrap: nowrap;
                padding-bottom: 1rem;
                margin-top: -1px;
                overflow-x: auto;
                text-align: center;
                white-space: nowrap;
                -webkit-overflow-scrolling: touch;
            }
        </style>
        <link href="assets/css/index.css" rel="stylesheet">
    </head>
    <body class="text-center">

        <main class="form-signin w-100 m-auto">
            <div class="col-md-12">
                <%
                    if (request.getParameter("e") != null) {
                        int grupoacesso = Integer.parseInt(request.getParameter("e"));
                        if (grupoacesso == 1) {
                            out.println("<div class=\"alert alert-danger mr-auto ml-auto shadow-sm text-center\" role=\"alert\">");
                            out.println("       Usuário Inválido!<br>Tente Novamente!");
                            out.println("</div>");
                        } else if (grupoacesso == 2) {
                            out.println("<div class=\"alert alert-danger mr-auto ml-auto shadow-sm text-center\" role=\"alert\">");
                            out.println("       Senha Inválida!<br>Tente Novamente!");
                            out.println("</div>");
                        } else if (grupoacesso == 3) {
                            out.println("<div class=\"alert alert-danger mr-auto ml-auto shadow-sm text-center\" role=\"alert\">");
                            out.println("       Usuário e Senha Inválidos!<br>Tente Novamente!");
                            out.println("</div>");
                        } else if (grupoacesso == 4) {
                            out.println("<div class=\"alert alert-danger mr-auto ml-auto shadow-sm text-center\" role=\"alert\">");
                            out.println("       Sessão Encerrada!<br>Tente Novamente!");
                            out.println("</div>");
                        }
                    }
                %>
            </div>

            <form name="formLogin" action="Autenticador" method="POST">
                <img class="mb-4" src="../assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
                <h1 class="h3 mb-3 fw-normal">Seja bem-vindo!</h1>

                <div class="form-floating">
                    <input type="text" class="form-control" id="txtUsuario" name="txtUsuario" placeholder="name@example.com" required autofocus>
                    <label for="txtUsuario">Usuário</label>
                </div>
                <div class="form-floating">
                    <input type="password" class="form-control" id="txtSenha" name="txtSenha" placeholder="Password" required>
                    <label for="txtSenha">Senha</label>
                </div>

                <div class="checkbox mb-3">
                    <label>
                        <input type="checkbox" value="esqueci-senha"> Esqueci minha senha
                    </label>
                </div>
                <button class="w-100 btn btn-lg btn-primary" type="submit">Entrar</button>
                <p class="mt-5 mb-3 text-muted">&copy; 2022</p>
            </form>
        </main>

        <script src="assets/node_modules/jquery/dist/jquery.js"></script>
        <script src="assets/node_modules/popper.js/dist/popper.js"></script>
        <script src="assets/node_modules/bootstrap/dist/js/bootstrap.js"></script>
    </body>
</html>
