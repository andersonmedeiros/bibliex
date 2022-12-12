<%-- 
    Document   : cadastro
    Created on : 11 de dez de 2022, 15:21:40
    Author     : STI
--%>

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
            <nav class="navbar navbar-expand-lg navbar-dark bg-primary" aria-label="Offcanvas navbar large">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Posto de Vendas - CIGS</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar2" aria-controls="offcanvasNavbar2">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasNavbar2" aria-labelledby="offcanvasNavbar2Label">
                        <div class="offcanvas-header">
                            <h5 class="offcanvas-title" id="offcanvasNavbar2Label">Posto de Vendas - CIGS</h5>
                            <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                        </div>
                        <div class="offcanvas-body">
                            <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                                <li class="nav-item">
                                    <a class="nav-link" aria-current="page" href="#">Home</a>
                                </li>

                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle active" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                        Usuários
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item active" href="cadastro.jsp">Novo</a></li>
                                        <li>
                                            <hr class="dropdown-divider">
                                        </li>
                                        <li><a class="dropdown-item" href="#">Ativos</a></li>
                                        <li><a class="dropdown-item" href="#">Inativos</a></li>
                                    </ul>
                                </li>
                                
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                        Livros
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="../livros/cadastro.jsp">Novo</a></li>
                                        <li>
                                            <hr class="dropdown-divider">
                                        </li>
                                        <li><a class="dropdown-item" href="#">Consultar</a></li>
                                    </ul>
                                </li>
                            </ul>

                        </div>
                    </div>
                </div>
            </nav>

            <div class="container my-5">
                <div class="bg-light p-5 rounded">
                    <div class="col-sm-8 py-5 mx-auto">
                        <h1 class="display-5 fw-normal mb-4">Cadastro de Usuário</h1>
                        <form class="row g-2">
                            <div class="form-floating">
                                <input type="text" class="form-control" id="floatingInput" placeholder="1234567789">
                                <label for="floatingInput">Identidade Militar</label>
                            </div>

                            <div class="form-floating">
                                <input type="text" class="form-control" id="floatingInput" placeholder="João">
                                <label for="floatingInput">Nome</label>
                            </div>

                            <div class="form-floating">
                                <input type="text" class="form-control" id="floatingInput" placeholder="Silva Ramos">
                                <label for="floatingInput">Sobrenome</label>
                            </div>

                            <div class="form-floating">
                                <input type="text" class="form-control" id="floatingInput" placeholder="Silva">
                                <label for="floatingInput">Nome de Guerra</label>
                            </div>

                            <div class="form-floating">
                                <input type="password" class="form-control" id="floatingInput" placeholder="senha">
                                <label for="floatingInput">Senha</label>
                            </div>

                            <div class="form-floating mb-3">
                                <select class="form-select" id="txtPostoGraduacao" name="txtPostoGraduacao">
                                    <option selected>Selecione um Posto ou Graduação...</option>
                                </select>
                                <label for="txtPostoGraduacao">Posto/Graduação</label>
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
