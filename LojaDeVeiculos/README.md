# Projeto-Loja-de-Veiculos

# MAROMO MARKETPLACE

## Índice

1. [Introdução](#introdução)
2. [Instalação e Configuração](#instalação-e-configuração)
3. [Guia do Usuário](#guia-do-usuário)
4. [FAQ](#faq)
5. [Resolução de Problemas](#resolução-de-problemas)
6. [Licenciamento](#licenciamento)
7. [Contato e Suporte](#contato-e-suporte)
8. [Diagrama de Classe](#diagrama-de-classe)

## Introdução

Este software, desenvolvido no curso de Análise e Desenvolvimento de Sistemas durante as aulas de "Programação Orientada
a Objetos" com o professor Marcos Roberto de Moraes, representa a aplicação prática dos conceitos essenciais dessa abord a
gem. O projeto desafiou a equipe a criar um sistema para uma loja de veículos, destacando-se a implementação eficiente de
polimorfismo, herança, encapsulamento e abstração. O polimorfismo simplificou a manipulação de diferentes tipos de veículos,
enquanto a herança facilitou a reutilização de código. O encapsulamento garantiu a segurança e integridade dos dados, e 
a abstração simplificou a complexidade do sistema. Além disso, a aplicação de interfaces fortaleceu os contratos entre 
partes do sistema, promovendo flexibilidade. A gestão de exceções assegurou a robustez do software.Este projeto não apenas
reflete o aprendizado acadêmico, mas demonstra a capacidade da equipe em integrar esses conceitos, criando um software 
eficiente que atende aos requisitos da loja de veículos com práticas sólidas de programação orientada a objetos.

## Instalação e Configuração

Visando simplificar a instalação, o software foi concebido com leveza, possibilitando sua execução em 
qualquer sistema compatível com IDEs como NetBeans, Eclipse ou IntelliJ.

1. *Clonar o Repositório:*
    - Certifique-se de ter o Git instalado em sua máquina. Se ainda não o possui, faça o download no [site oficial do Git](https://git-scm.com/) ou utilize o comando apt install git no Linux. Após a conclusão da instalação, execute o seguinte comando no terminal: 
      
    - git clone https://github.com/TheSamuZ/Projeto-Loja-de-Veiculos

4. *Execução do Programa:*
    - Ao seguir essas etapas, o programa estará pronto para ser executado sem qualquer problema.

Estas orientações foram elaboradas para simplificar o processo de instalação do software, tornando-o direto e sem complicações. 
Em caso de dúvidas ou problemas, sinta-se à vontade para entrar em contato com a equipe.

## Guia do Usuário


em expandir suas capacidades.O sistema incorpora as funcionalidades essenciais de um E-commerce padrão, permitindo aos 
usuários adicionar,
remover e listar itens no carrinho de compras, além de exibir o total da compra. Destinada exclusivamente aos clientes,
a interface não concede ao lojista a capacidade de realizar operações, como a adição de produtos ao estoque.

É importante observar que o sistema não inclui controle sobre a quantidade de produtos em estoque ou funcionalidades
semelhantes, uma escolha deliberada alinhada ao escopo inicial da atividade proposta. No entanto, a arquitetura do
sistema foi concebida de maneira flexível, possibilitando a incorporação de novas funcionalidades, caso haja interesse

## FAQ

*Pergunta: "As annotations do Lombok não estão funcionando, o que eu faço?"*

Resposta: Se as annotations do Lombok não estiverem funcionando, siga estes passos. Primeiramente, verifique se você
instalou o plugin corretamente. Em seguida, confira se há alguma atualização disponível para o plugin. Se o problema
persistir, acesse o arquivo pom.xml e certifique-se de que está atualizado. Se estiver utilizando o IntelliJ IDEA,
é possível realizar a atualização clicando no ícone M de Maven no canto superior direito.

*Pergunta: "Há sublinhados vermelhos por toda parte!"*

Resposta: Se você notar sublinhados vermelhos em todo lugar, antes de tudo, verifique qual versão do JDK está em uso.
Recomenda-se priorizar versões mais recentes. O programa foi desenvolvido utilizando o JDK 21, portanto, o uso de outras
versões do Java pode causar problemas. Certifique-se de estar utilizando uma versão compatível para evitar
inconsistências no código.

## Resolução de Problemas

Todas as exceções foram tratadas devidamente durante o desenvolvimento do sistema, portanto, não é esperado que mensagens
desse tipo ocorram. Contudo, em caso de eventualidades, solicitamos que entre em contato, fornecendo as informações
relevantes para que possamos resolver qualquer problema que possa surgir. Estamos à disposição para oferecer suporte e
garantir uma experiência sem contratempos.

## Licenciamento

O software em questão é licenciado sob os termos da Licença MIT, uma licença de software de código aberto que permite
aos usuários usar, modificar e distribuir o software, tanto para fins comerciais quanto não comerciais. A Licença MIT é
conhecida por sua simplicidade e permissividade, garantindo a liberdade dos usuários ao mesmo tempo em que oferece uma
proteção legal clara para os desenvolvedores. Ao adotar a Licença MIT, buscamos promover a colaboração e o compartilhamento
de conhecimento, incentivando uma comunidade aberta em torno do desenvolvimento e uso do software.

## Contato e Suporte

Em caso de qualquer problema ou dúvida relacionada ao software, recomendamos utilizar a seção ["Issues"](https://github.com/vinicius-delfin/maromo-marketplace/issues)
disponível neste repositório no GitHub. A funcionalidade de "Issues" fornece um ambiente organizado para relatar problemas,
sugestões ou discussões relacionadas ao desenvolvimento. Alternativamente, sinta-se à vontade para entrar em contato
diretamente por e-mail através de [vinicius.delfin@gmail.com](mailto:vinicius.delfin@gmail.com). Estamos comprometidos em
garantir uma experiência positiva para os usuários e estamos prontos para oferecer suporte e assistência sempre que
necessário.

## Diagrama de Classe

![Diagrama](images/DiagramaDeClasse.png)