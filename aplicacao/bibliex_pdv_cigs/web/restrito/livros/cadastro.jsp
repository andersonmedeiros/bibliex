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
        <title>PDV - CADASTRO LIVRO</title>
        
        
        
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
    </head>
    <body>
        <%
            HttpSession sessao = request.getSession();
            Usuario usuarioLogado = (Usuario) sessao.getAttribute("usuarioAutenticado");
        %>
        <main>
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
                                                + "<a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">"
                                                + "Usu??rios"
                                                + "</a>"
                                                + "<ul class=\"dropdown-menu\">"
                                                + "<li><a class=\"dropdown-item\" href=\"../usuario/cadastro.jsp\">Novo</a></li>"
                                                + "<li>"
                                                + "<hr class=\"dropdown-divider\">"
                                                + "</li>"
                                                + "<li><a class=\"dropdown-item\" href=\"#\">Ativos</a></li>"
                                                + "<li><a class=\"dropdown-item\" href=\"#\">Inativos</a></li>"
                                                + "</ul>"
                                                + "</li>"
                                                + "<li class=\"nav-item dropdown\">"
                                                + "<a class=\"nav-link dropdown-toggle active\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">"
                                                + "Livros"
                                                + "</a>"
                                                + "<ul class=\"dropdown-menu\">"
                                                + "<li><a class=\"dropdown-item active\" href=\"cadastro.jsp\">Novo</a></li>"
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
                                                + "<a class=\"nav-link\" aria-current=\"page\" href=\"#\">Home</a>"
                                                + "</li>"
                                                + "<li class=\"nav-item dropdown\">"
                                                + "<a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">"
                                                + "Usu??rios"
                                                + "</a>"
                                                + "<ul class=\"dropdown-menu\">"
                                                + "<li><a class=\"dropdown-item\" href=\"../usuario/cadastro.jsp\">Novo</a></li>"
                                                + "<li>"
                                                + "<hr class=\"dropdown-divider\">"
                                                + "</li>"
                                                + "<li><a class=\"dropdown-item\" href=\"#\">Ativos</a></li>"
                                                + "<li><a class=\"dropdown-item\" href=\"#\">Inativos</a></li>"
                                                + "</ul>"
                                                + "</li>"
                                                + "<li class=\"nav-item dropdown\">"
                                                + "<a class=\"nav-link dropdown-toggle active\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">"
                                                + "Livros"
                                                + "</a>"
                                                + "<ul class=\"dropdown-menu\">"
                                                + "<li><a class=\"dropdown-item active\" href=\"cadastro.jsp\">Novo</a></li>"
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
                <div class="bg-light p-5 rounded">
                    <div class="col-sm-8 py-5 mx-auto">
                        <h1 class="display-5 fw-normal mb-4">Cadastro de Livro</h1>
                        <form class="row g-2">
                            <p class="fs-5">Dados do Livro</p>
                            <div class="form-floating">
                                <input type="text" class="form-control" id="floatingInput" placeholder="1234567789">
                                <label for="floatingInput">ISBN</label>
                            </div>

                            <div class="form-floating">
                                <input type="text" class="form-control" id="floatingInput" placeholder="Jo??o">
                                <label for="floatingInput">T??tulo</label>
                            </div>
                            
                            <div class="form-floating">
                                <input type="text" class="form-control" id="floatingInput" placeholder="Autor">
                                <label for="floatingInput">Autor</label>
                            </div>
                            
                            <div class="form-floating col-md-4">
                                <input type="number" class="ano form-control" id="floatingInput" placeholder="Ano" min="0">
                                <label for="floatingInput">Editorial (Ano)</label>
                            </div>

                            <div class="form-floating col-md-4">
                                <input type="number" class="form-control" id="floatingInput" placeholder="Paginas" min="0">
                                <label for="floatingInput">Quantidade de P??ginas</label>
                            </div>
                            
                            <div class="form-floating col-md-4">
                                <input type="text" class="dinheiro form-control" id="floatingInput" placeholder="Silva">
                                <label for="floatingInput">Valor Unit??rio (R$)</label>
                            </div>                                                   
                            
                            <div class="form-floating col-md-6">
                                <select class="form-select" id="floatingSelect">
                                    <option selected>Selecione a editora do livro...</option>
                                </select>
                                <label for="floatingSelect">Editora</label>
                            </div>
                            
                            <div class="form-floating col-md-6">
                                <select class="form-select" id="floatingSelect">
                                    <option selected>Selecione a cole????o do livro...</option>
                                </select>
                                <label for="floatingSelectPGrad">Cole????o</label>
                            </div>
                            
                            <p class="fs-5">Dimens??es do Livro</p>
                            <div class="form-floating col-md-3">
                                <input type="number" class="form-control" id="floatingInput" placeholder="Largura" min="0" step="0.01">
                                <label for="floatingInput">Largura (cm)</label>
                            </div>
                            <div class="form-floating col-md-3">
                                <input type="number" class="form-control" id="floatingInput" placeholder="Espessura" min="0" step="0.01">
                                <label for="floatingInput">Espessura (cm)</label>
                            </div>
                            <div class="form-floating col-md-3">
                                <input type="number" class="form-control" id="floatingInput" placeholder="Altura" min="0" step="0.01">
                                <label for="floatingInput">Altura (cm)</label>
                            </div>
                            <div class="form-floating col-md-3">
                                <input type="number" class="form-control" id="floatingInput" placeholder="Peso" min="0" step="0.01">
                                <label for="floatingInput">Peso (kg)</label>
                            </div>
                            
                            <p class="fs-5">Estoque do Livro</p>
                            <div class="form-floating">
                                <input type="number" class="form-control" id="floatingInput" placeholder="Quantidade" min="0">
                                <label for="floatingInput">Quantidade: </label>
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
        
        <script src="https://igorescobar.github.io/jQuery-Mask-Plugin/js/jquery.mask.min.js"></script>
        <script src="../../assets/js/mascaras.js"></script>
        
        <script src="../../assets/node_modules/popper.js/dist/popper.js"></script>
        <script src="../../assets/node_modules/bootstrap/dist/js/bootstrap.js"></script>
        <script src="../../assets/node_modules/bootstrap/dist/js/bootstrap.bundle.js"></script>
    </body>
</html>
