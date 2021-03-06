## Informações

#### Avisos
- O framework lombok estava inicialmente configurado no projeto, porem como não consefui realizar a instalação dele no STS 4, resolvi remover para não prejudicar o desenvolvimento
- Não consegui conectar com 0 bando Oracle, parece que esta fora, porem configurei o projeto de forma que aceita trabalhar com qualquer banco, e para teste e desenvolvimento utilizei o H2 em memoria

#### Executar o projeto

1. Realize o clone do projeto e importe como projeto maven (Pode ser que dê um erro devido à falta de ojdbc6.jar no repositório maven - [use essa solução](https://stackoverflow.com/questions/44238622/missing-artifact-com-oracleojdbc6jar11-2-0-3))
2. Executar como spring boot app
3. url dos recursos 
	- /produto/find-all - retorna todos os produtos sem paginação
	- /produto/total-por-tipo - retorna a quantidade de produto por tipo
	
#### Melhorias realizada
- Adicionado Dtos
- Refatorado resources
- Adicionado Exception padroes e handlers para tratar erros das requisições

#### Melhorias que não deu tempo de fazer
 - Adicionar paginação nas consultas do tipo find all
 - Adicionar segurança autorização e autenticação com spring security
 - Adicionar tratativa erros em todas as requisições (handlers)
 - Melhorar o mappeamento Dto <=> entity, talves com modelmapper
 - implementar os testes
<hr>

## Quitanda do Barnabé
<cenario>
Barnabé é um quitandeiro muito antenado nas últimas tendências de técnicas que auxiliem o seu negócio, porém nem sempre foi assim.
Logo no inicio da sua quitanda, ele fazia a gestão do seu negócio utilizando apenas de uma caderneta de papel, o que atendia a demanda do seu estabelecimento. Pelos preços agressivos e uma alta margem de lucro, graças a reposição de estoque que na sua maior parte era da sua própria propriedade rural, o volume de clientes começou a aumentar e com isto o controle financeiro do seu estabelecimento começou a perder a eficiência, sendo necessário melhorar a sua gestão.

Barnabé tem um afilhado que sempre foi muito ligado em tecnologia, e por isto acabou recebendo como presente um treinamento de desenvolvimento de portais do seu Padrinho. Em modo de agradecimento, ficou combinado entre ambos que ao final do curso o Crispin iria de alguma forma ajudar o Barnabé com o controle da sua quitanda, entregando um portal para automatizar este trabalho.

De fato a entrega foi feita, Barnabé ficou muito feliz porém com o tempo começou a perceber que nem todas as informações apresentadas condiziam com o que o mesmo sabia que tinha. Crispin informou que isso era um MVP, e que assim que ele voltasse de férias iria continuar com novas entregas.

Barnabé não tem tempo disponível para aguardar seu afilhado, e o controle na caderneta já está sendo muito estressante.

Você foi contratado pelo Barnabé, como consultor de desenvolvimento de sistemas, para entregar o que ele precisa:

- Sistema confiável com o que mostra.
- Sem lentidões.

Na conversa de levantamento de requisitos com o Barnabé, obviamente você não obteve sucesso em levantar documentações técnicas e nem funcionais escritas pelo Crispin, pois o mesmo não deixou nada. Por sorte, você encontrou no servidor um arquivo txt com as seguintes informações:

# hints.txt
NÃO ESQUECER
Antes de começar a programar, preciso de:
NodeJS, 
Uma vez com o node instalado, preciso:
npm install 
npm install -g bower
npm install -g grunt
bower install

Depois que tiver feito isto, preciso executar o grunt:
grunt serve

!!!IMPORTANTE!!!
Estou usando como Frontend o AngularJS

!!!TO DO!!!
Já criei a camada de testes do projeto integrada com o Maven, porém preciso criar os teste unitários. No próximo módulo aprenderei isso.

!!!NÃO ESQUEUCER!!!
Preciso do maven para rodar o projeto. É springboot, não SpringBreak! 
Lembrar de baixar o SQL Developer para conectar no banco, ao invés de usar o shell. Arquivo com dados de acesso ao banco em application.properties
# EOF
</cenario>

## Avaliação

O objetivo deste laboratório é avaliar os seguintes conceitos:
- Técnicas de otimização de sistemas;
- Boas práticas de programação;
- Habilidade em desenvolvimento para Frontend, Backend e Banco de dados;
- Capacidade de abstração de cenários com pouca informações técnicas;

## Entrega

- Será considerado para avaliação um fork entregue até a hora de limite final estipulado pelo avaliado. Compartilhe seu fork com o e-mail: ingrid.pinho@yaman.com.br
