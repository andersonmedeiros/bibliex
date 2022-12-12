<%-- 
    Document   : cadastro
    Created on : 11 de dez de 2022, 15:21:40
    Author     : STI
--%>

<%@page import="model.bean.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="Anderson de Paula Andrade Medeiros">
        <title>PDV - CADASTRO USUÁRIO</title>

        <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/navbars-offcanvas/">
        <link href="../../assets/node_modules/bootstrap/compiler/bootstrap.css" rel="stylesheet">

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
        <!-- Custom styles for this template -->
        <link href="../../assets/css/padrao.css" rel="stylesheet">

        <script type='text/javascript' src='../../dwr/engine.js'></script>
        <script type='text/javascript' src='../../dwr/interface/FacadeAjax.js'></script>
        <script type='text/javascript' src='../../dwr/util.js'></script> 
    </head>
    <body>
        <main>
            <%
                HttpSession sessao = request.getSession();
                Usuario usuarioLogado = (Usuario) sessao.getAttribute("usuarioAutenticado");
            %>
            <nav class="navbar navbar-expand-lg navbar-dark bg-primary" aria-label="Offcanvas navbar large">
                <div class="container-fluid">
                    <%
                        out.println("<a class=\"navbar-brand\" href=\"#\">Bem-vindo, " + usuarioLogado.getNomeguerra() + "!</a>");
                    %>
                    <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar2" aria-controls="offcanvasNavbar2">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasNavbar2" aria-labelledby="offcanvasNavbar2Label">
                        <div class="offcanvas-header">
                            <%
                                out.println("<h5 class=\"offcanvas-title\" id=\"offcanvasNavbar2Label\">Bem-vindo, " + usuarioLogado.getNomeguerra() + "!</h5>");
                            %>
                            <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                        </div>
                        <div class="offcanvas-body">
                            <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">

                                <%
                                    if (usuarioLogado.getIdGrupoAcesso() == 1) {
                                        out.println(
                                                "<li class=\"nav-item\">"
                                                + "<a class=\"nav-link\" aria-current=\"page\" href=\"../inicial.jsp\">Home</a>"
                                                + "</li>"
                                                + "<li class=\"nav-item dropdown\">"
                                                + "<a class=\"nav-link dropdown-toggle active\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">"
                                                + "Usuários"
                                                + "</a>"
                                                + "<ul class=\"dropdown-menu\">"
                                                + "<li><a class=\"dropdown-item active\" href=\"cadastro.jsp\">Novo</a></li>"
                                                + "<li>"
                                                + "<hr class=\"dropdown-divider\">"
                                                + "</li>"
                                                + "<li><a class=\"dropdown-item\" href=\"#\">Ativos</a></li>"
                                                + "<li><a class=\"dropdown-item\" href=\"#\">Inativos</a></li>"
                                                + "</ul>"
                                                + "</li>"
                                                + "<li class=\"nav-item dropdown\">"
                                                + "<a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">"
                                                + "Livros"
                                                + "</a>"
                                                + "<ul class=\"dropdown-menu\">"
                                                + "<li><a class=\"dropdown-item\" href=\"../livros/cadastro.jsp\">Novo</a></li>"
                                                + "<li>"
                                                + "<hr class=\"dropdown-divider\">"
                                                + "</li>"
                                                + "<li><a class=\"dropdown-item\" href=\"#\">Consultar</a></li>"
                                                + "</ul>"
                                                + "</li>"
                                        );
                                    } else if (usuarioLogado.getIdGrupoAcesso() == 2) {
                                        out.println(
                                                "<li class=\"nav-item\">"
                                                + "<a class=\"nav-link\" aria-current=\"page\" href=\"../inicial.jsp\">Home</a>"
                                                + "</li>"
                                                + "<li class=\"nav-item dropdown\">"
                                                + "<a class=\"nav-link dropdown-toggle active\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">"
                                                + "Usuários"
                                                + "</a>"
                                                + "<ul class=\"dropdown-menu\">"
                                                + "<li><a class=\"dropdown-item active\" href=\"cadastro.jsp\">Novo</a></li>"
                                                + "<li>"
                                                + "<hr class=\"dropdown-divider\">"
                                                + "</li>"
                                                + "<li><a class=\"dropdown-item\" href=\"#\">Ativos</a></li>"
                                                + "<li><a class=\"dropdown-item\" href=\"#\">Inativos</a></li>"
                                                + "</ul>"
                                                + "</li>"
                                                + "<li class=\"nav-item dropdown\">"
                                                + "<a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">"
                                                + "Livros"
                                                + "</a>"
                                                + "<ul class=\"dropdown-menu\">"
                                                + "<li><a class=\"dropdown-item\" href=\"../livros/cadastro.jsp\">Novo</a></li>"
                                                + "<li>"
                                                + "<hr class=\"dropdown-divider\">"
                                                + "</li>"
                                                + "<li><a class=\"dropdown-item\" href=\"#\">Consultar</a></li>"
                                                + "</ul>"
                                                + "</li>"
                                        );
                                    }
                                %>    

                            </ul>
                            <form class="form-inline my-2 my-lg-0" name="formSair" action="Sair" method="POST">                  
                                <button class="btn btn-danger my-2 my-sm-0" type="submit">Sair</button>
                            </form>
                        </div>
                    </div>
                </div>
            </nav>
            

            <div class="container my-5">
                <%
                    if (request.getParameter("e") != null) {
                        int retorno = Integer.parseInt(request.getParameter("e"));
                        if (retorno == 1) {
                            out.println("<div class=\"alert alert-success shadow-sm text-center\" role=\"alert\">");
                            out.println("       Usuário adicionado com sucesso!");
                            out.println("</div>");
                        } else if (retorno == 2) {
                            out.println("<div class=\"alert alert-danger shadow-sm text-center\" role=\"alert\">");
                            out.println("       Erro durante a realização do cadastro.<br>Tente Novamente!");
                            out.println("</div>");
                        }
                    }
                %>
                <div class="bg-light p-5 rounded">
                    <div class="col-sm-8 py-5 mx-auto">
                        <h1 class="display-5 fw-normal mb-4">Cadastro de Usuário</h1>
                        <form class="row g-2" action="controller.usuario/CadastrarUsuario" method="POST" name="formCadastrar">
                            <div class="form-floating">
                                <input type="text" class="form-control" id="txtIdtMilitar" name="txtIdtMilitar" placeholder="1234567789">
                                <label for="txtIdtMilitar">Identidade Militar</label>
                            </div>                            

                            <div class="form-floating">
                                <select class="form-select" id="txtPostoGraduacao" name="txtPostoGraduacao">
                                    <option selected>Selecione um posto ou graduação...</option>
                                </select>
                                <label for="txtPostoGraduacao">Posto/Graduação</label>
                            </div>

                            <div class="form-floating">
                                <input type="text" class="form-control" id="txtNome" name="txtNome" placeholder="João">
                                <label for="txtNome">Nome</label>
                            </div>

                            <div class="form-floating">
                                <input type="text" class="form-control" id="txtSobrenome" name="txtSobrenome" placeholder="Silva Ramos">
                                <label for="txtSobrenome">Sobrenome</label>
                            </div>

                            <div class="form-floating">
                                <input type="text" class="form-control" id="txtNomeGuerra" name="txtNomeGuerra" placeholder="Silva">
                                <label for="txtNomeGuerra">Nome de Guerra</label>
                            </div>

                            <div class="form-floating">
                                <input type="password" class="form-control" id="txtSenha" name="txtSenha" placeholder="senha">
                                <label for="txtSenha">Senha</label>
                            </div>

                            <div class="form-floating mb-3">
                                <select class="form-select" id="txtGrupoAcesso" name="txtGrupoAcesso">
                                    <option selected>Selecione um grupo de acesso...</option>
                                    <option value="1">Administrador</option>
                                    <option value="2">Atendente</option>
                                </select>
                                <label for="txtGrupoAcesso">Perfil de Acesso</label>
                            </div>

                            <div class="col-12">
                                <button type="submit" class="btn btn-primary">Cadastrar</button>
                                <button type="button" class="btn btn-danger">Cancelar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </main>

        <script src="../../assets/node_modules/jquery/dist/jquery.js"></script>
        <script src="../../assets/node_modules/popper.js/dist/popper.js"></script>
        <script src="../../assets/node_modules/bootstrap/dist/js/bootstrap.js"></script>
        <script src="../../assets/node_modules/bootstrap/dist/js/bootstrap.bundle.js"></script>

        <script src="../../assets/js/dwr/usuario/camposDinamicos.js"></script>
    </body>
</html>
