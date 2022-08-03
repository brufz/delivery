<h1>SISTEMA DE DELIVERY</h1>

>  <h2> INSTALAÇÃO </h2>
<p>Intellij</p>
<p>JDK 11+</p>
<p>Postman</p>

> <h2> STATUS </h2>
<p>Concluido, com possíveis melhorias futuras</p>

> <h2> TECNOLOGIAS UTILIZADAS </h2>
<p> JAVA </p>
<p> Spring Boot </p>
<p> Banco de dados MySQL </p>

> <h2> SOBRE </h2>
<p> Este é um projeto desenvolvido para o Grupo Acert, que visa a construção de um sistema simplificado de delivery de um restaurante.
<p> O projeto é dividido em :
<p> Pedidos: Onde o restaurante pode se cadastrar e cadastrar seu cardápio </p>
<p> Cliente: Onde o cliente cadastra seus dados </p>
<p> Entrega: São os dados do entregador que irá realizar o pedido </p>
<p> Usuário: É a parte que ocorre a permissão de admin do projeto, onde após o cadastro é gerado um token, e somente com ele é possível cadastrar pedidos, entrega e clientes. </p>

> <h2> Endereços e funcionalidades</h2>
<p> <strong> Endpoint para o cadastro: </strong> "/usuarios/cadastrar" </p>
<p> <strong> Endpoint para logar: </strong> "/usuarios/logar" </p>
<strong> Após logado, é gerado um token, esse é necessário para os próximos cadastros </strong>
<br>
<p> <strong> Endpoint para cadastro de cliente: </strong> "/cliente" </p>
<p> <strong> Dados para o cadastro de clientes: </strong> "nomeCliente", "cpfCliente", "enderecoCliente", "emailCliente". O id é gerado automaticamente. </p>
<br>
<p> <strong> Endpoint para o cadastro de entregador: </strong> "/entrega" </p>
<p> <strong> Dados para o cadastro de entregador: </strong> "nomeEntregador", "meioTransporte". O id é gerado automaticamente. </p>
<br>
<p> <strong> Endpoint para o cadastro de pedidos: </strong> "/pedidos" </p>
<p> <strong> Dados para o cadastro de pedidos: </strong> "nomeRestaurante", "cnpjRestaurante", "enderecoRestaurante", "nomeProduto", "precoProduto" </p>
<br>


