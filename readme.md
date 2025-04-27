[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/L04k_9nU)

# Laboratório 1: Classes e objetos

---

## Informações do aluno
**Instituição:** Instituto Federal de Santa Catarina - Câmpus São Jośe  
**Aluno:** Ygor Vinicius Martins                                        
**Semestre:** 2025/1    
**Componente Curricular:** Programação orientada a objetos (POO)        
**Curso:** Engenharia de Telecomunicações

---

## Sobre este repositório:

Este repositório tem como objetivo realizar as atividades propostas pelo docente, no que se refere a realizar ajustes em
algumas das classes trabalhadas no laboratório 1, além da implementação de uma nova classe. Utilizando de conceitos
da programação orientada a objetos referentes a modificadores, e também conceitos de métodos construtotes.

---

## Lâmpada

Altere a classe de forma tal que:

•Lâmpadas possam ser criadas com seu estado definido ou com um estado padrão desligado  
• Conte o número total de lâmpadas criadas    

*boolean ligada:* Seu atributo inicializa como *false*, para representar que está desligada  
*static int quantidade:* Quantidade de lâmpadas criadas ao decorrer do código  

*public Lampada()* Cria uma lâmpada desligada  
*public Lampada(boolean estado):* Cria uma lâmpada com o estado que foi passado como parâmetro  
*void ligar():*  Altera o atributo *ligada* para *true*  
*void desligar():* Altera o atributo *ligada* para *true*  
*boolean verEstado():* Retorna o valor contido no atributo *ligada*, se está ligada retorna *true*, caso contrário *false*  

---

## Pessoa

Altere a classe de forma tal que:  

- Pessoas tenham um CPF no formato “xxx.xxx.xxx-xx” constante a ser informado na criação.  
### Importante:  
>  - Se o CPF informado for vazio, atribua um valor padrão (“123.456.789-00”).  
>  - Se o informado não for vazio, assuma que ele está certo (não implemente uma validação de CPF na classe Pessoa, pessoas não validam CPFs)  
- Pessoas possam ser criadas de três maneiras diferentes: apenas CPF, CPF e nome, ou com os três argumentos  

*String nome:* Armazena o nome da pessoa (Não aceita nome sem caracteres)  
*int idade:* Idade da pessoa (Somente idades maiores ou iguias a 0)
*String cpf* Armazena o cpf da pessoa no formato exigido  

*public Pessoa(String cpf):* Cria uma pessoa com apenas CPF  
*public Pessoa(String cpf, String nome):* Cria uma pessoa com CPF e nome  
*public Pessoa(String cpf, String nome, int idade):* Cria uma pessoa com CPF, nome e idade  
*boolean setNome(String nome):* Seta o nome da pessoa, retorna true em caso de sucesso, falso caso contrário  
*String getNome():* Retorna o nome da pessoa  
*boolean setIdade():* Seta a idade da pessoa, retorna true em caso de sucesso, falso caso contrário  
*int getIdade:* Retorna a idade da pessoa  
*void felizAniversario:* Encrementa a idade da pessoa em 1  
*public boolean setCpf(String CPF):* Seta o CPF da pessoa, retorna true em caso de sucesso, falso caso contrário  
*public String getCpf():* Retorna o CPF da pessoa  

---

## Retângulo

Altere a classe de forma tal que:  

• Nenhum retângulo possa ser criado sem largura e altura definida. Se valores não positivos forem informados, devem ser iniciados com 1  
• Exista um registro do retângulo de maior área já criado  
• Exista um registro do retângulo de menor perímetro já criado  

*float largura:* Armazena a largura do retângulo (Aceita apenas valores maiores que 0)  
*float altura:* Armazena a altura do retângulo (Aceita apenas valores maiores que 0)  
*static float maior_area:* Armazena o valor da maior área de um retângulo criado
*static float menor_perimetro:* Armazena o valor do menor perímetro de um retângulo criado
*static Retangulo retangulo_maior_area:* Armazena o retângulo que possui maior área
*static Retangulo retangulo_menor_perimetro:* Armazena o retângulo com menor perímetro
*static Retangulo[] retangulos:* Armazena todos os retângulos já criados
*static int qtd_retangulos:* Armazena a quantidade total de retângulos criados

*boolean setLargura(float largura):* Seta o valor da largura do retângulo, retorna true caso obtenha sucesso, false caso contrário    
*boolean setAltura(float altura):* Seta o valor da altura do retângulo, retorna true caso obtenha sucesso, false caso contrário    
*float getArea():* Retorna o valor da área do retângulo (altura * largura)  
*float getPerimetro():* Retorna o valor do Perímetro do retângulo ((altura + largura) * 2)  
*float getMenorPerimetro():* Retorna o valor do menor perímetro de todos os retângulos
*float getMaiorArea():* Retorna o valor da maior área de todos os retângulos
*Retangulo menorRetaguloPerimetro():* Retorna o retângulo de menor perímetro
*Retangulo maiorRetaguloArea():* Retorna o retângulo de maior área
*int getQtd_retangulos():* Retorna a quantidade total de retângulos criados
*Retangulo[] getRetangulos():* Retorna um vetor com todos os retângulos criados

### Métodos privados:  

*void maiorArea():* Verifica se o retângulo e o valor de maior área precisam ser alterados
*void menorPerimetro():* Verifica se o retângulo e o valor de menor perímetro precisam ser alterados

---

## Relógio

Altere a classe de forma tal que:  

• Relógios possam ser criados com valores de hora, hora e minuto, ou hora minuto e segundo. Caso qualquer valor seja inválido, o objeto deve ser inicializado com valores zerados   
• Exista um método que sincronize um relógio com outro   
• Exista um método que retorne a diferença, em segundos, das horas de um relógio para outro    

*byte hora:* Armazena o valor da hora (Apenas valores maiores ou iguais a 0 e valores menores que 24)   
*byte minuto:* Armazena o valor do minuto (Apenas valores maiores ou iguais a 0 e valores menores que 60)   
*byte segundo:* Armazena o valor do segundo (Apenas valores maiores ou iguais a 0 e valores menores que 60)   

*Relogio(byte hora):* Cria um relógio com hora setada, outros valores inicializam como 0  
*Relogio(byte hora, byte minuto):* Cria um relógio com horas e minutos setados, segundo inicializado como 0    
*Relogio(byte hora, byte minuto, byte segundo):* Cria um relógio com hora, minuto e segundos seetados  
*void valorInvalido:* Seta todos os valores para 0 caso seja passado um valor inválido tanto no ajuste quanto na costrução do objeto   
*void ajustaHora(byte hora, byte minuto, byte segundo):* Seta o valor inicial do relógio em cada um dos atributos indicados    
*String getHora():* Retorna a hora no formato de 24 horas  
*void avancaHora():* Incrementa 1 hora no relógio (Faz ajustes em casos onde a hora passa de 23)    
*void avancaMinuto():* Incrementa 1 minuto no relógio (Faz ajustes em casos onde o minuto passa de 59)    
*void avancaSegundo():* Incrementa 1 segundo no relógio (Faz ajustes em casos onde o segundo passa de 59)    
*void sincronizaRelogio(Relogio relogio):* Sincroniza um relógio com o outro  
*int diferencaRelogio(Relogio relogio):* Retorna a diferença em segundos de um relógio para outro   

### Método extra  

*String getHoraAMPM():* Retorna a hora no formato de 12 horas  

---

## Produto

Altere a classe de forma tal que:  

- Produtos só possam ser criados com nome e preço válidos e sempre tenham desconto inicial de 0%   
- Tenha um registro do número total de produtos criados   
- Produtos tenham um código identificador do tipo String no formato “CD:xxx-xxx”  
    - Após definido, o código de um produto não deve ser alterado   
    - O código é gerado automaticamente a partir do registro de total   
    - Exemplos: o terceiro produto tem código “CD:000-003”; o milésimo produto tem código “CD:001-000”.   
    - É necessário um método para descobrir o código de qualquer produto (getCodigo)  
- Tenha um registro dos últimos produtos criados.  
   - Assuma que o sistema pode ter, no máximo, 50 registros.  
   - Quando novos produtos são criados, o produto mais antigo é esquecido para dar espaço ao mais novo.   
- Tenha um método estático para expor o registro de produtos em formato .csv  
   - Esse método não deve utilizar System.out ou acesso à arquivos  
   - Ele deve retornar um vetor de Strings para a aplicação principal imprimir  
   - A primeira linha deve ser um cabeçalho com os nomes das colunas do .csv  
   - As próximas linhas devem conter os atributos dos produtos registrados  
   - Assuma que o .csv é separado por ‘ ; ’ (para não confundir com o decimal dos números)  
   - Abaixo está um exemplo do conjunto de Strings gerada por esse método  
>Código;Nome;Preço;Desconto  
CD:000-001;Geladeira;782,08;6  
CD:000-002;Micro-ondas;439,12;12  
CD:000-003;Fogão 4 bocas Eletrolux KL4003;677,00;0  

*String nome:* Armazena o nome do produto (Não aceita nome sem caracteres)  
*int preco* Armazena o preço do produto (Não aceita valores menores que 0)  
*int desconto* Armazena a % do desconto (Não aceita inteiros menores que 0 ou inteiros maiores que 100)  
*String codigo_id:* Armazena o código de ID do produto  
*static int qtd_produtos:* Armazena a quantidade de produtos criados  
*static final String[] registro:* Armazena todas as informações dos produtos no formato csv
*boolean inicializado:* Armazena se o produto já foi criado

*public Produto(String nome, int preco):* Cria um produto com nome e preço definidos
*boolean setNome(String nome):* Seta o nome do produto, retorna true caso obtenha sucesso, false caso contrário  
*String getNome():* Retorna o nome do produto  
*boolean setPreco(int preco):* Seta o preço do produto, retorna true caso obtenha sucesso, false caso contrário    
*float getPreco():* Retorna o preço do produto  
*float setDesconto(int desconto):* Seta a % de desconto sob o produto  
*float getDesconto():* Retorna o valor em % do desconto  
*String anuncio():* Exibe uma mensagem de anúncio do produto  
*int getQtdProdutos:* Retorna a quantidade de produtos criados
*String getCodigo():* Retorna o código do produto
*String[] getRegistro():* Retorna o registro, cada índice possui as informações de todos os produtos criados no formato csv

### Métodos privados

*void setId():* Seta o ID do produto  
*void adcionaRegistro():* Adiciona um produto ao registro  
*void ajustaRegistro():* Ajusta o produto no registro  
*int trataLimiteRegistro():* Garante requiseção de registra apenas 50 produtos no registro, e substitui apenas os últimos em caso de mais de 50 produtos  

---

## Navio 

Modele uma classe para representar um navio do jogo batalha naval.  
Para cada navio é importante saber o seu tamanho, a sua posição (linha e coluna) no tabuleiro,
a sua orientação (vertical ou horizontal), a letra que o representa no tabuleiro (e.g. P para
porta-aviões), quais posições ele já foi atingido e se ele foi afundado ou não.  
Pense em quais atributos e métodos podem ser úteis para a classe e implemente-os. Considere
que os métodos dessa classe serão invocados por um programa principal que representa o jogo
batalha naval. Assim, os métodos devem ser úteis para o jogo, como por exemplo, verificar se o
navio foi atingido, se ele foi afundado, etc.  

*int tamanho:* Armazena o tamanho do navio  
*String pos:* Armazena as posições ocupadas pelo navio  
*String pos_atingidas:* Armazena as posições do navio que foram atingidas  
*String orientacao:* Armazena a orientação em que ele está  
*String aparencia:* Armazena a aparência do navio no tabuleiro  
*boolean afundado:* Armazena se este está afundado ou não, true caso esteja afundado, false caso contrário  
*static int qtd_navios:* Armazena a quantidade de navios criados  

*Navio(int tamanho, int[] pos, String orientacao, String aparencia):* Cria um navio com tamanho, posição de origem, orientação e aparência definidos  
*boolean setTamanho(int tamanho):* Seta o tamanho do navio, retorna true caso obtenha sucesso, false caso contrário      
*boolean setPos(int[] pos):* Seta as posições de ocupação do navio, retorna true caso obtenha sucesso, false caso contrário      
*boolean setOrientacao(String orientacao):* Seta a orientação do navio, retorna true caso obtenha sucesso, false caso contrário      
*boolean setAparencia(String aparencia):* Seta a aparência do navio, retorna true caso obtenha sucesso, false caso contrário      
*int getTamanho():* Obtém o tamanho do navio  
*String getOrientacao():* Obtém a orientação do navio  
*String getAparencia():* Obtém a aparência do navio  
*String getPos():* Obtém as posições de ocupação do navio  
*boolean foiAtingido(String pos):* Retorna true caso seja atingido, falso caso contrário  
*boolean getAfundado():* Retorna se está afundado, retorna true caso esteja afundado, false caso contrário  
*int getQtd_navios():* Retorna a quantidade de navios criados  
*String getPos_atingidas():* Retorna as posições do navio que foram atingidas  

### Métodos Privados  

*void recebeDano():* Atualiza os atributos quando o navio tem uma de suas posições atingidas  