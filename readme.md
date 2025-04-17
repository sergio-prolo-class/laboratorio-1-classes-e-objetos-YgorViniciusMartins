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

Este repositório tem como objetivo realizar as atividades propostas pelo docente, no que se refere a compreensão dos conceitos
iniciaias da programação orientada a objetos na linguagem de programação Java, explorando conceitos básicos de classe e obejto

---

## Lâmpada

   Modele uma lâmpada que pode ser ligada ou desligada. Inclua:

>**• Atributos:**  
    - (boolean) ligada
    
>**• Métodos:**  
    - (void) ligar()  
    - (void) desligar()    
    - (boolean) verEstado()    

*boolean ligada:* Seu atributo inicializa como *false*, para representar que está desligada

*void ligar():*  Altera o atributo *ligada* para *true*  
*void desligar():* Altera o atributo *ligada* para *true*  
*boolean verEstado():* Retorna o valor contido no atributo *ligada*, se está ligada retorna *true*, caso contrário *false*  

---

## Pessoa

Modele uma pessoa que possui nome, idade e pode fazer aniversário. Inclua:

>• Atributos:  
    - (String) nome  
    - (int) idade  

>• Métodos:  
    - (void) setNome(String nome)  
    - (String) getNome()  
    - (void) setIdade(int idade)  
    - (int) getIdade()  
    - (void) felizAniversario()  

*String nome:* Armazena o nome da pessoa (Não aceita nome sem caracteres)  
*int idade:* Idade da pessoa (Somente idades maiores ou iguias a 0)  

*void setNome(String nome):* Seta o nome da pessoa  
*String getNome():* Retorna o nome da pessoa  
*void setIdade():* Seta a idade da pessoa  
*int getIdade:* Retorna a idade da pessoa  
*void felizAniversario:* Encrementa a idade da pessoa em 1  

---

## Retângulo

Modele um retângulo em plano cartesiano bidimensional, que possua formas de calcular sua
área e perímetro. Inclua:

>• Atributos:  
    - (float) largura  
    - (float) altura  

>• Métodos:  
    - (void) setLargura(float largura)  
    - (void) setAltura(float altura)  
    - (float) getArea()  
    - (float) getPerimetro() 

*float largura:* Armazena a largura do retângulo (Aceita apenas valores maiores que 0)  
*float altura:* Armazena a altura do retângulo (Aceita apenas valores maiores que 0)  

*void setLargura(float largura):* Seta o valor da largura do retângulo  
*void setAltura(float altura):* Seta o valor da altura do retângulo  
*void getArea():* Retorna o valor da área do retângulo (altura * largura)  
*void getPerimetro():* Retorna o valor do Perímetro do retângulo ((altura + largura) * 2)  

---

## Relógio

Modele um relógio que apresenta os valores de hora, minuto e segundo (formato HH:MM:SS).
Inclua:

>• Atributos:  
    - (byte) hora  
    - (byte) minuto  
    - (byte) segundo  

>• Métodos:
    - (void) ajustaHora(byte hora, byte minuto, byte segundo)  
    - (String) getHora()  
    - (void) avancaHora()  
    - (void) avancaMinuto()  
    - (void) avancaSegundo()  

*byte hora:* Armazena o valor da hora (Apenas valores maiores ou iguais a 0 e valores menores que 24)  
*byte minuto:* Armazena o valor do minuto (Apenas valores maiores ou iguais a 0 e valores menores que 60)  
*byte segundo:* Armazena o valor do segundo (Apenas valores maiores ou iguais a 0 e valores menores que 60)  

*void ajustaHora(byte hora, byte minuto, byte segundo):* Seta o valor inicial do relógio em cada um dos atributos indicados  
*String getHora():* Retorna a hora no formato de 24 horas
*void avancaHora():* Incrementa 1 hora no relógio (Faz ajustes em casos onde a hora passa de 23)  
*void avancaMinuto():* Incrementa 1 minuto no relógio (Faz ajustes em casos onde o minuto passa de 59)  
*void avancaSegundo():* Incrementa 1 segundo no relógio (Faz ajustes em casos onde o segundo passa de 59)  

### Método extra

*String getHoraAMPM():* Retorna a hora no formato de 12 horas

---

## Produto

Modele um produto que possui nome, preço e uma taxa de desconto. Inclua:  

>• Atributos:  
    - (String) nome  
    - (int) preco  
    - (int) desconto  

>• Métodos:  
    - (void) setNome(String nome)  
    - (String) getNome()  
    - (void) setPreco(int preco)  
    - (float) getPreco()  
    - (void) setDesconto(int desconto)  
    - (int) getDesconto()  

*String nome:* Armazena o nome do produto (Não aceita nome sem caracteres)  
*int preco* Armazena o preço do produto (Não aceita valores menores que 0)  
*int desconto* Armazena a % do desconto (Não aceita inteiros menores que 0 ou inteiros maiores que 100)  

*void setNome(String nome):* Seta o nome do produto  
*String getNome():* Retorna o nome do produto  
*void setPreco(int preco):* Seta o preço do produto  
*float getPreco():* Retorna o preço do produto  
*float setDesconto(int desconto):* Seta a % de desconto sob o produto  
*float getDesconto():* Retorna o valor em % do desconto  

---

## Livro 

>Modele um livro que possui título, autor, até dois gêneros literários, o número total de páginas,
os títulos de cada capítulo e as páginas onde cada capítulo começa. Assuma que o livro pode
ter, no máximo, 30 capítulos. A lista de possíveis gêneros literários é: Fantasia, Aventura,
Romance, Mistério, Terror, Auto-ajuda e Pedagógico.

Como podemos observar, este exercício se diferencia dos outros pois este não nos é deixado de 
forma explícita. Portanto, esta atividade exige que esta classe seja modelada pelos próprios discentes,
assim, a forma que este repositório escolheu para representar o livro foi a seguinte:

>• Atributos:  
    - String titulo  
    - String autor  
    - String[] generos   
    - String[] titulos_cap   
    - int paginas  
    - int[] pagina_cap  
    - int paginas_lidas    
    - int qtd_cap  

>• Métodos:

    - (void) setTitulo()
    - (String) getTitulo()
    - (void) setAutor()
    - (String) getAutor()
    - (void) setGeneros()
    - (String) getGeneros()
    - (void) setPaginas()
    - (int) getPaginas()
    - (void) setTitulos_cap()
    - (String[]) getTitulos_cap()
    - (int[]) getPagina_cap()
    - (String) lendoAtual()
    - (void) lerPaginas()
    - (int) getPaginas_lidas()

*String titulo:* Armazena titulo do livro (Não aceita título sem caracteres)  
*String autor:* Armazena autor do livro (Não aceita autor sem caracteres)  
*String[] generos:* Armazena generos do livro (Podem ser 1 ou 2 gêneros. Não aceita gêneros sem caracteres)  
*String[] titulos_cap:* Armazena os nomes do capítulos do livro (Aceita até 30 títulos. Não aceita título sem caracteres)  
*int paginas:* Armazena a quantidade de páginas do livro (não aceita números negativos)  
*int[] pagina_cap:* Armazena o página de início de cada capítulo (Não aceita números menores que 0 ou números maiores que a quantidaed de páginas)  
*int paginas_lidas:* Armazena o número total de páginas já lidas  
*int qtd_cap:* Armazena a quantidade de capítulos do livro    

*void setTitulo(String titulo):* Seta o título do livro  
*String getTitulo():* Retorna o título do livro  
*void setAutor(String autor):* Seta o nome do autor do livro  
*String getAutor():* Retorna o nome do autor do livro  
*void setGeneros(String genero1, String genero2):* Seta os generos do livro (Está sobrecarregada, também funciona com void setGeneros(String genero))  
*String[] getGeneros():* Retorna os gêneros do livro  
*void setPaginas(int paginas):* Seta o total de páginas do livro  
*int getPaginas():* Retorna a quantidade de páginas do livro  
*void setTitulos_cap(String titulo_cap, int inicio_cap):* Seta os títulos dos capítulos e suas respectivas páginas de início  
*String[] getTitulos_cap():* Retorna os títulos dos capítulos  
*int[] getPagina_cap():* Retorna as páginas de início de cada capítulo  
*String lendoAtual():* Retorna o capítulo atual da leitura  
*void lerPaginas(int qtd):* Lê a quantidade de páginas informada  
*int getPaginas_lidas():* Retorna a quantidade de páginas lidas  

### Métodos Extras

*void set_Paginacap(int pagina_cap):* Seta a pagina de início de um determinado capítulo  
*boolean verificaGenero(String genero1, String genero2):* Verifica se o gênero que está sendo passado existe (Função sobrecarregada, também funciona com boolean verificaGenero(String genero))  