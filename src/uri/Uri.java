/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Uri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cálculo Simples
        /*
        Scanner teclado = new Scanner(System.in);
        Integer A = teclado.nextInt();
        Integer B = teclado.nextInt();        
        Double C = teclado.nextDouble();
        Double peca1 = (double)(B*C);
        Integer D = teclado.nextInt();
        Integer E = teclado.nextInt();        
        Double F = teclado.nextDouble();
        Double peca2 = (double) (E*F) ;
        Float valor = (float)(peca1 + peca2);
        System.out.format("VALOR A PAGAR: R$ %.2f\n",valor);
         */
        //Esfera
        /*
        Scanner teclado = new Scanner(System.in);
        Double C = teclado.nextDouble();
        Double volume = (double)((4.0/3)*3.14159*(Math.pow(C,3)));
        System.out.format("VOLUME = %.3f\n", volume);
         */
        //Area
        /*
        Scanner teclado = new Scanner(System.in);
        Double A = teclado.nextDouble();
        Double B = teclado.nextDouble();
        Double C = teclado.nextDouble();
        Double triangulo = (double) (A * C)/2;
        Double circulo = (double) (3.14159*(Math.pow(C,2)));
        Double trapezio = (double) ((A+B)*C)/2;
        Double quadrado = (double)(Math.pow(B,2));
        Double retangulo = (double)(A*B);
        System.out.format("TRIANGULO: %.3f\n",triangulo);
        System.out.format("CIRCULO: %.3f\n",circulo);
        System.out.format("TRAPEZIO: %.3f\n",trapezio);
        System.out.format("QUADRADO: %.3f\n",quadrado);
        System.out.format("RETANGULO: %.3f\n",retangulo);
         */
        //O maior
        /*
        Scanner teclado = new Scanner(System.in);
        Integer A = teclado.nextInt();
        Integer B = teclado.nextInt();
        Integer C = teclado.nextInt();
        int D = (A+B+(Math.abs(A-B)))/2;
        int maiorABC = (C+D+(Math.abs(C-D)))/2;
        System.out.println(maiorABC+" eh o maior");
         */
        //Consumo
        /*
        Scanner teclado = new Scanner(System.in);
        Integer X = teclado.nextInt();
        Float Y = teclado.nextFloat();
        Double consMedio = (double) (X/Y);
        System.out.format("%.3f km/l\n",consMedio);
         */
        //Distância entre dois pontos:
        /*
        Scanner teclado = new Scanner(System.in);
        Float X = teclado.nextFloat();
        Float Y = teclado.nextFloat();
        Float X1 = teclado.nextFloat();
        Float Y1 = teclado.nextFloat();
        Double distancia = Math.sqrt(Math.pow((X1 - X),2)+Math.pow((Y1 - Y) , 2));
        System.out.format("%.4f\n",distancia);
         */
        //Distância
        /*
        Scanner teclado = new Scanner(System.in);
        Integer A = (int) teclado.nextInt();
        int distancia = 2*A;
        System.out.println(distancia+" minutos");
         */
        //Gasto de Combustível
        /*
        Scanner teclado = new Scanner(System.in);
        Integer A = (int) teclado.nextInt();
        Integer B = (int) teclado.nextInt();
        Double dist = (double) (A*B)/12;
        System.out.format("%.3f\n",dist);
         */
        //Cédulas
        /*
        Scanner teclado = new Scanner(System.in);
        Integer A = (int) teclado.nextInt();
        Integer cem = (int) (A/100);
        Integer rest = (int) (A%100);
        Integer cin = (int)(rest/50);
        Integer rest1 = (int)(rest%50);
        Integer vin = (int) (rest1/20);
        Integer rest2 = (int) (rest1%20);
        Integer dez = (int) (rest2/10);
        Integer rest3 = (int) (rest2%10);
        Integer cinc = (int) (rest3/5);
        Integer rest4 = (int) (rest3%5);
        Integer dois = (int) (rest4/2);
        Integer rest5 = (int) (rest4%2);
        Integer um = (int) (rest5/1);
        System.out.println(A);
        System.out.println(cem+" nota(s) de R$ 100,00");
        System.out.println(cin+" nota(s) de R$ 50,00");
        System.out.println(vin+" nota(s) de R$ 20,00");
        System.out.println(dez+" nota(s) de R$ 10,00");
        System.out.println(cinc+" nota(s) de R$ 5,00");
        System.out.println(dois+" nota(s) de R$ 2,00");
        System.out.println(um+" nota(s) de R$ 1,00");
         */
        //Conversão de Tempo
        /*
        Scanner teclado = new Scanner(System.in);
        Integer A = (int) teclado.nextInt();
        Integer horas = (int) (A / 3600);
        Integer minutos = (int) (A%3600)/60;
        Integer segundos = (int) (A%3600)%60;
        System.out.format(horas+":"+minutos+":"+segundos+"\n");
         */
        //Idade em dias
        /*
        Scanner teclado = new Scanner(System.in);
        Integer A = (int) teclado.nextInt();
        Integer ano = (int) (A/365);
        Integer mes = (int) (A%365)/30;
        Integer dia = (int) (A%365)%30;
        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(dia+" dia(s)");
         */
        //Notas e Moedas
        /*
        Scanner teclado = new Scanner(System.in);
        Float A = teclado.nextFloat();
        Integer cem = (int) (A/100);
        Float rest = (float) (A%100);
        Integer cin = (int)(rest/50);
        Float rest1 = (float)(rest%50);
        Integer vin = (int) (rest1/20);
        Float rest2 = (float) (rest1%20);
        Integer dez = (int) (rest2/10);
        Float rest3 = (float) (rest2%10);
        Integer cinc = (int) (rest3/5);
        Float rest4 = (float) (rest3%5);
        Integer dois = (int) (rest4/2);
        Float rest5 = (float) (rest4%2);
        Integer um = (int) (rest5/1);
        Float rest6 = (float) (rest5%1);
        Integer mcinq = (int) (rest6/0.50);
        Float rest7 = (float)(rest6%0.50);
        Integer mVinC = (int) (rest7/0.25);
        Float rest8 = (float)(rest7%0.25);
        Integer mDez = (int)(rest8/0.10);
        Float rest9 = (float)(rest8%0.10);
        Integer mCinc = (int) (rest9/0.05);
        Float rest10 = (float)(rest9%0.05);
        Integer mUm = (int)(rest10/0.0087);
        System.out.println("NOTAS:");
        System.out.println(cem+" nota(s) de R$ 100.00");
        System.out.println(cin+" nota(s) de R$ 50.00");
        System.out.println(vin+" nota(s) de R$ 20.00");
        System.out.println(dez+" nota(s) de R$ 10.00");
        System.out.println(cinc+" nota(s) de R$ 5.00");
        System.out.println(dois+" nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(um+" moeda(s) de R$ 1.00");
        System.out.println(mcinq+" moeda(s) de R$ 0.50");
        System.out.println(mVinC+" moeda(s) de R$ 0.25");
        System.out.println(mDez+" moeda(s) de R$ 0.10");
        System.out.println(mCinc+" moeda(s) de R$ 0.05");
        System.out.println(mUm+" moeda(s) de R$ 0.01");
         */
        //Teste de Seleção
        /*
        int a, b,c,d;
        Scanner teclado =  new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        
        if((b>c)&&(d>a)&&((c + d)>(a + b))&&(c > 0)&&(d > 0 ) && (a%2 == 0)){
            
            System.out.println("Valores aceitos");
        
        }else{
            System.out.println("Valores nao aceitos");
            
        }
         */
        //Intervalo
        /*
        float a;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextFloat();
        if((a>=0)&&(a<=25)){
            System.out.println("Intervalo [0,25]");
        }else{ 
        if((a>25)&&(a<=50)){
            System.out.println("Intervalo (25,50]");
        }else{
        if((a>50)&&(a<=75)){
            System.out.println("Intervalo (50,75]");
        }else{
        if((a>75)&&(a<=100)){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }}}}
         */
        //Lanche 
        /*
        double a, b, c, d, e, total ;
        int code, qtd;
        Scanner teclado = new Scanner(System.in);
        a = 4.00;
        b = 4.50;
        c = 5.00;
        d = 2.00;
        e = 1.50;
        code = teclado.nextInt();
        qtd = teclado.nextInt();
        
        switch(code){
            case 1:
                total = qtd * a;
                System.out.format("Total: R$ %.2f\n",total);
                break;
            case 2:
                total = qtd * b;
                System.out.format("Total: R$ %.2f\n",total);
                break;
            case 3:
                total = qtd * c;
                System.out.format("Total: R$ %.2f\n",total);
                break;
            case 4:
                total = qtd * d;
                System.out.format("Total: R$ %.2f\n",total);
                break;
            case 5:
                total = qtd * e;
                System.out.format("Total: R$ %.2f\n",total);
                break;
            default:
                System.out.println("");
                break;
                
            
        };
             
         */
        //Média 3
        /*
        float n1,n2,n3,n4, media, n5;
        Scanner nt = new Scanner(System.in);
        n1 = nt.nextFloat();
        n2 = nt.nextFloat();
        n3 = nt.nextFloat();
        n4 = nt.nextFloat();
        media = ((n1*2+n2*3+n3*4+n4*1)/10);
        System.out.format("Media: %.1f\n",media);
        
        if(media >=7.0){
        
            System.out.println("Aluno aprovado.");
        }
        if(media < 5.0){
        
            System.out.println("Aluno reprovado.");
        }
        if(media >= 5.0 && media <= 6.9){
        
            System.out.println("Aluno em exame.");
            n5 = nt.nextFloat();
            System.out.format("Nota do exame: %.1f\n",n5);
            media = (media + n5)/2;
            if (media >= 5.0){
                System.out.println("Aluno aprovado.");
            }
            if(media <= 4.9){
            System.out.println("Aluno reprovado.");
            }
            
            System.out.format("Media final: %.1f\n",media);
        }
         */
        //Coordenadas de um ponto
        /*
        float x, y;
        Scanner ler = new Scanner(System.in);
        x = ler.nextFloat();
        y = ler.nextFloat();
        if ((x == 0)&&(y == 0)){
            System.out.println("Origem");
        }
        if ((x == 0)&&(y != 0)){
            System.out.println("Eixo Y");
        }
        if ((y == 0)&&(x != 0)){
            System.out.println("Eixo X");
        }
        if ((x > 0)&&(y > 0)){
            System.out.println("Q1");
        }
        if ((x < 0)&&(y > 0)){
            System.out.println("Q2");
        }
        if ((x > 0)&&(y < 0)){
            System.out.println("Q4");
        }
        if ((x < 0)&&(y < 0)){
            System.out.println("Q3");
        }
         */
        //Sort Simples
        /*
        int a, b, c;
        Scanner fel = new Scanner(System.in);
        a = fel.nextInt();
        b = fel.nextInt();
        c = fel.nextInt();
        
        if (a>=b && b>=c){
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        if(a>=b && c>=b && a>=c){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
        if(a>=b && c>=b && a<=c){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        if(a<=b && c>=b && a<=c){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        if(a<=b && c<=b && a<=c){
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
        if(a<=b && c<=b && a>=c){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println("\n"+a);
        System.out.println(b);
        System.out.println(c);
         */
        //Triangulos
        /*
        float a, b, c, per, are;
        Scanner tri = new Scanner(System.in);
        a = tri.nextFloat();
        b = tri.nextFloat();
        c = tri.nextFloat();
        if ((a+b > c && a+c > b && b+c > a)){
            per = a + b + c;
            System.out.format("Perimetro = %.1f\n",per);
        
        }else{
            are = ((a+b)*c)/2;
            System.out.format("Area = %.1f\n",are);
        }
         */
        //Multiplos
        /*
        int a, b;
        Scanner lei = new Scanner(System.in);
        a = lei.nextInt();
        b = lei.nextInt();
        if (b%a == 0 || a%b == 0 ){
            System.out.println("Sao Multiplos");
        
        }else{
            System.out.println("Nao sao Multiplos");
        }
         */
 /*
        int a, b, c, horas;
        Scanner lei = new Scanner(System.in);
        a = lei.nextInt();
        b = lei.nextInt();
        if(a>=b){
        c = 24 - a;
        horas = c + b;
        System.out.println("O JOGO DUROU "+horas+" HORA(S)");
        }else{
        horas = b - a;
        System.out.println("O JOGO DUROU "+horas+" HORA(S)");
        }
        
        Scanner t = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float a = t.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float b = t.nextFloat();
        float m  = (a+b)/2;
        System.out.println("Sua media é: "+m);
        if(m>9){
            System.out.println("Parabéns");
        }
        
        Scanner tec = new Scanner(System.in);
        int a = tec.nextInt();
        int i = 2019 - a;
        System.out.println("A sua idade é "+i+" ano(s)");
        if (a>=18){
            System.out.println("Você é maior de idade ");
        }else{
            System.out.println("Você é menor de idade");
        }
        
        Scanner mouse = new Scanner(System.in);
        Long a = (long) mouse.nextInt();
        if(a%2 == 0){
            System.out.println("O número "+a+" é par.");
            
        }else{
            System.out.println("O número "+a+" é impar.");
        }
         */
        // Tipos de Triangulos
        /*
        Scanner tec = new Scanner(System.in);
        double a = tec.nextDouble();
        double b = tec.nextDouble();
        double c = tec.nextDouble();
        double x;
        if (a <= b && b <= c) {
            x = a;
            a = c;
            c = x;
        }
        if (a >= b && a <= c) {
            x = a;
            a = c;
            c = b;
            b = x;
        }
        if (a <= b && a >= c ) {
            x = a;
            a = b;
            b = x;
        }
        if (a <= b && c >= a) {
            x = a;
            a = b;
            b = c;
            c = x;
        }
        if (a >= b && b <= c) {
            x = b;
            b = c;
            c = x;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        
        
        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        }else if (Math.pow(a, 2) == ((b * b) + (c * c))) {
                System.out.println("TRIANGULO RETANGULO");
                if (a ==b && c==a){
                    System.out.println("TRIANGULO EQUILATERO");
                }
                else if((a==b && b!=c) || (a==c && c!=b) || (b==c && a!=c)){
                    System.out.println("TRIANGULO ISOSCELES");
                }
        }else if (Math.pow(a, 2) > (Math.pow(b, 2) + (Math.pow(c, 2)))) {
                System.out.println("TRIANGULO OBTUSANGULO");
                if (a ==b && c==a){
                    System.out.println("TRIANGULO EQUILATERO");
                }
                else if((a==b && b!=c) || (a==c && c!=b) || (b==c && a!=c)){
                    System.out.println("TRIANGULO ISOSCELES");
                }
        }else if (Math.pow(a, 2) < ((Math.pow(b, 2) + (Math.pow(c, 2))))) {
                System.out.println("TRIANGULO ACUTANGULO");
                if (a ==b && c==a){
                    System.out.println("TRIANGULO EQUILATERO");
                }
                else if((a==b && b!=c) || (a==c && c!=b) || (b==c && a!=c)){
                    System.out.println("TRIANGULO ISOSCELES");
                }
        }
         */

        //Tempo Horas e minutos
        /*
        Scanner tec = new Scanner(System.in);
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();
        int d = tec.nextInt();
        if((a==b&&c==d)&&a==c){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        
        if((a <c)&&(b < d)){
            int hora = c - a ;
            int minuto = d - b;
            System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
        }
        if((a < c)&&(b > d)){
            int hora = c - a - 1 ;
            int minuto = (d+60) - b ;
            System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
        }
        if((a > c)&&(b > d)){
            int hora = (c + 24) - a -1;
            int minuto = (d+60) - b ;
            System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
        }
        if((a > c)&&(b < d)){
            int hora = (c + 24) - a ;
            int minuto = d - b ;
            System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
        }
        if((a == c)&&(b > d)){
            int hora = (24-1);
            int minuto = (60 + d) - b ;
            System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
        }
        if((a == c)&&(b < d)){
            int hora = 0;
            int minuto = d - b ;
            System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
        }
        if((a < c)&&(b == d)){
            int hora = c - a ;
            int minuto = 0 ;
            System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
        }
        if((a > c)&&(b == d)){
            int hora = (c+24) - a ;
            int minuto = 0 ;
            System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
        }
         */
        //Animal
        /*
        Scanner tec = new Scanner(System.in);
        String coluna = tec.nextLine();
        String cordado = tec.nextLine();
        String alimentacao = tec.nextLine();
        if(coluna.equals("vertebrado")){
            if(cordado.equals("ave")){
                if(alimentacao.equals("carnivoro")){
                    System.out.println("aguia");
                }else if(alimentacao.equals("onivoro")){
                    System.out.println("pomba");
                }
                
            }else if(cordado.equals("mamifero")){
                if(alimentacao.equals("onivoro")){
                    System.out.println("homem");
                }else if(alimentacao.equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }
        if(coluna.equals("invertebrado")){
            if(cordado.equals("inseto")){
                if(alimentacao.equals("hematofago")){
                    System.out.println("pulga");
                }else if(alimentacao.equals("herbivoro")){
                    System.out.println("lagarta");
                }
                
            }else if(cordado.equals("anelideo")){
                if(alimentacao.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else if(alimentacao.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
         */
        //DDD
        /*
        Scanner tec = new Scanner(System.in);
        int n1 = tec.nextInt();
        switch(n1){
            case 61 :
                System.out.println("Brasilia");
                break;
            case 71 :
                System.out.println("Salvador");
                break;
            case 11 :
                System.out.println("Sao Paulo");
                break;
            case 21 :
                System.out.println("Rio de Janeiro");
                break;
            case 32 :
                System.out.println("Juiz de Fora");
                break;
            case 19 :
                System.out.println("Campinas");
                break;
            case 27 :
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default :
                System.out.println("DDD nao cadastrado");
        }
         */
        //Imposto de Renda
        /*
        Scanner tec = new Scanner(System.in);
        double renda = tec.nextDouble();
        if(renda >= 0 && renda <=2000){
            System.out.println("Isento");
        }else if(renda >= 2000.01 && renda <=3000){
            System.out.format("R$ %.2f\n",((renda - 2000)* 0.08));
        }else if(renda >= 3000.01 && renda <= 4500){
            double sobreSai = renda - 3000;
            System.out.format("R$ %.2f\n",((sobreSai)* 0.18)+((renda - sobreSai - 2000) * 0.08));
        }else if(renda > 4500){
            double sobreSai = renda - 4500;
            double faixaTres = ((renda - sobreSai - 3000 )) ;
            double faixaDois = ((renda - sobreSai - faixaTres - 2000));
            System.out.format("R$ %.2f\n",(sobreSai * 0.28 + faixaTres * 0.18 + faixaDois * 0.08));
        }
         */
        //Mês
        /*
        Scanner tec = new Scanner(System.in);
        int n1 = tec.nextInt();
        switch(n1){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
        }
         */
        //Números Pares
        /*
        int n1 = 1;
        while (n1 <= 100){
            if(n1 % 2 == 0  ){
                System.out.println(n1);
                n1++;
            }
        }
         */
        //Números Positivos
        /*
        Scanner tec = new Scanner(System.in);
        int c = 0;
        int ci = 0;
        double num = 0;
        while (c < 6) {
            num = tec.nextDouble();
            if (num > 0) {
                ci = ci + 1;
            }
            c++;
        }
        System.out.println(ci + " valores positivos");
        */
        //Valores positivos e media
        /*
        Scanner tec = new Scanner(System.in);
        double media = 0;
        int c = 0;
        int ci = 0;
        double num = 0;
        while (c < 6) {
            num = tec.nextDouble();
            if (num > 0) {
                ci = ++ci;
                media = media + num;
            }
            c++;
        }
        media = (media)/ci;
        System.out.println(ci + " valores positivos");
        System.out.format("%.1f\n",media);
        */
        //Numeros Pares
        /*
        Scanner tec = new Scanner(System.in);
        int c = 0;
        int cP = 0;
        int num = 0;
        while (c < 5) {
            num = tec.nextInt();
            if (num %2 == 0) {
                cP = ++cP;
            }
            c++;
        }
        System.out.println(cP+" valores pares");
        */
        //Issoae
        /*
        Scanner tec = new Scanner(System.in);
        int c = 0;
        int cI = 0;
        int cP = 0;
        int cm = 0;
        int cn = 0;
        int num = 0;
        while (c < 5) {
            num = tec.nextInt();
            if (num %2 == 0) {
                cP = ++cP;
            }
            if (num %2 != 0){
                cI = ++cI;
            }
            if(num > 0 ){
                cm = ++cm;
            }
            if(num < 0){
                cn = ++cn;
            }
            c++;
        }
        System.out.println(cP+" valor(es) par(es)");
        System.out.println(cI+" valor(es) impar(es)");
        System.out.println(cm+" valor(es) positivo(s)");
        System.out.println(cn+" valor(es) negativo(s)");
        */
        //Numeros Impares
        /*
        Scanner tec = new Scanner(System.in);
        int n1 = Math.abs(tec.nextInt());
        int c = 0;
        while(c <= n1){
            if(n1 <= 1000 && (c%2 != 0) && c <= n1){
                System.out.println(c);
            }
            c = ++c;
        }
        */
        //Seis Números Impáres
        /*
        Scanner tec = new Scanner(System.in);
        int n1 = tec.nextInt();
        int c = 0;
        while(c<6){
            if(n1 %2 != 0){
                System.out.println(n1);
                c++;
            }
            n1++;
        }
        */
        //Soma Impáres
        /*
        Scanner tec = new Scanner(System.in);
        int n1 = tec.nextInt();
        int n2 = tec.nextInt();
        int c = 0;
        int soma = 0;
        if(n1 > n2){
            while(n1 > n2){
                n2++;
                if(n1 == n2){
                    break;
                }
                if( n2%2 != 0){
                    soma = soma + n2;
                }
            }
        }else if (n2 > n1){
            while(n2 > n1){
                n1++;
                if(n1 == n2){
                    break;
                    }
            if( n1%2 != 0){
                soma = soma + n1;
            }
        }
        }
            System.out.println(soma);
        */
        //Intevalo 2
        /*
        Scanner tec = new Scanner(System.in);
        int n1 = tec.nextInt();
        int c = 0;
        int dent = 0;
        int fora = 0;
        while(c < n1){
            int num = tec.nextInt();
            if(num >= 10 && num <= 20){
                dent = ++dent;
            }else{
                fora = ++fora;
            }
            c++;
        }
        System.out.println(dent+" in");
        System.out.println(fora+" out");
        */
        //Quadrado de Pares
        /*
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        int c = 1;
        while(c <= n){
            c++;
            if(c%2 == 0){
                System.out.println(c+"^2 = "+(c*c));
            }
        }
        */
        //Par ou ímpar
        /*
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        int c = 0;
        while(c < n){
            ++c;
            int num = tec.nextInt();
            if(num == 0){
                System.out.println("NULL");
            }
            if(num > 0 && num%2 != 0){
                System.out.println("ODD POSITIVE");
            }
            if(num > 0 && num%2 == 0){
                System.out.println("EVEN POSITIVE");
            }
            if(num < 0 && num%2 != 0){
                System.out.println("ODD NEGATIVE");
            }
            if(num < 0 && num%2 == 0){
                System.out.println("EVEN NEGATIVE");
            }
        }
        */
        //Resto 2
        /*
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        int c = 1;
        while(c<=10000){
            if(c%n == 2){
                System.out.println(c);
            }
            c++;
        }
        */
        //Tabuada
        /*
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        int c = 1;
        while(c<=10){
            System.out.println(c+" x "+n+" = "+(c*n));
            c++;
        }
        */
        //Médias Ponderadas
        /*
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        int c = 0;
        while(c<n){
            float n1 = tec.nextFloat();
            float n2 = tec.nextFloat();
            float n3 = tec.nextFloat();
            float mediaP = ((n1*2)+ (n2*3)+ (n3*5))/10;
            System.out.format("%.1f\n",mediaP);
            c++;
            }
        */
        //Maior e posição
        
        /*
        Scanner tec = new Scanner(System.in);
        int c = 1;
        int maior = 0;
        int posicao = 0;
        while(c<=100){
            int n1 = tec.nextInt();
            if(n1 >= maior){
                maior = n1;
                posicao = c;
            }
            c++;
        }
        System.out.println(maior);
        System.out.println(posicao);
        
        */
        //Experiências
        /*
        Scanner tec = new Scanner(System.in);
        int coelhos = 0, sapos = 0,ratos = 0, total = 0;
        double totC = 0, totR = 0, totS = 0,tot = 0;
        int n = tec.nextInt();
        int c = 1;
        
        while(c<=n){
            double n1 = tec.nextInt();
            String tipo = tec.nextLine();
            if (tipo.equals(" C")){
                coelhos = (int)(coelhos + n1);
                totC = (totC + n1);
                tot = (tot + n1);
                total = (int)(total + n1);
                
            }else if (tipo.equals(" R")){
                ratos = (int)(ratos + n1);
                total = (int)(total + n1);
                totR = (totR + n1);
                tot = (tot + n1);
            }else if (tipo.equals(" S")){
                sapos = (int)(sapos + n1);
                total = (int)(total + n1);
                totS = (totS + n1);
                tot = (tot + n1);
            }
            
            
            c++;
            
        }
        
        
        System.out.println("Total: "+total+" cobaias");
        System.out.println("Total de coelhos: "+coelhos);
        System.out.println("Total de ratos: "+ratos);
        System.out.println("Total de sapos: "+sapos);
        double perCoe = ((totC*100)/tot);
        double perRat = ((totR*100)/tot);
        double perSap = ((totS*100)/tot);
        System.out.format("Percentual de coelhos: %.2f",perCoe);
        System.out.print(" %\n");
        System.out.format("Percentual de ratos: %.2f",perRat);
        System.out.print(" %\n");
        System.out.format("Percentual de sapos: %.2f",perSap);
        System.out.print(" %\n");
        */
        //Tempo de um evento
        /*
        Scanner tec = new Scanner(System.in);
        String dia, dp, diaFim;
        int diaIni, numDiaFim, horaIni, horaFim, minIni, minFim, segIni, segFim, totDia = 0, totHora = 0, totMin = 0 , totSeg = 0;
        //Colhendo os dados do início do evento
        dia = tec.next();
        diaIni = tec.nextInt();
        horaIni = tec.nextInt();
        dp = tec.next();
        minIni = tec.nextInt();
        dp = tec.next();
        segIni = tec.nextInt();
        //Colhendo os dados do fim do evento
        diaFim = tec.next();
        numDiaFim = tec.nextInt();
        horaFim = tec.nextInt();
        dp = tec.next();
        minFim = tec.nextInt();
        dp = tec.next();
        segFim = tec.nextInt();
        
        //Agora e se
        if (horaFim >= horaIni && minFim >= minIni && segFim >= segIni){
            totDia = numDiaFim - diaIni;
            totHora  = horaFim - horaIni;
            totMin = minFim - minIni;
            totSeg = segFim - segIni;
        }else if (horaFim < horaIni && minFim >= minIni && segFim >= segIni){
            totDia = numDiaFim - diaIni - 1;
            totHora  = (horaFim + 24) - horaIni;
            totMin = minFim - minIni;
            totSeg = segFim - segIni;
        }else if (horaFim > horaIni && minFim < minIni && segFim >= segIni){
            totDia = numDiaFim - diaIni;
            totHora  = horaFim - horaIni - 1;
            totMin = (minFim + 60) - minIni;
            totSeg = segFim - segIni;
        }else if (horaFim == horaIni && minFim < minIni && segFim >= segIni){
            totDia = numDiaFim - diaIni - 1;
            totHora  = (horaFim + 24) - horaIni - 1;
            totMin = (minFim + 60) - minIni;
            totSeg = segFim - segIni;
        }else if (horaFim > horaIni && minFim > minIni && segFim < segIni){
            totDia = numDiaFim - diaIni;
            totHora  = horaFim - horaIni;
            totMin = minFim - minIni - 1;
            totSeg = (segFim+ 60) - segIni;
        }else if (horaFim > horaIni && minFim < minIni && segFim < segIni){
            totDia = numDiaFim - diaIni ;
            totHora  = horaFim - horaIni-1;
            totMin = (minFim + 60) - minIni - 1;
            totSeg = (segFim+ 60) - segIni;
        }else if (horaFim < horaIni && minFim > minIni && segFim < segIni){
            totDia = numDiaFim - diaIni - 1;
            totHora  = (horaFim + 24) - horaIni;
            totMin = minFim - minIni - 1;
            totSeg = (segFim+ 60) - segIni;
        }else if (horaFim < horaIni && minFim < minIni && segFim < segIni){
            totDia = numDiaFim - diaIni - 1;
            totHora  = (horaFim + 24) - horaIni -1;
            totMin = (minFim + 60) - minIni - 1;
            totSeg = (segFim+ 60) - segIni;
        }
        
        if (horaFim == horaIni && minFim < minIni && segFim >= segIni){
            totDia = numDiaFim - diaIni - 1;
            totHora  = (horaFim + 24) - horaIni - 1;
            totMin = (minFim + 60) - minIni;
            totSeg = segFim - segIni;
        }
        if (horaFim > horaIni && minFim == minIni && segFim < segIni){
            totDia = numDiaFim - diaIni ;
            totHora  = horaFim  - horaIni - 1;
            totMin = (minFim + 60) - minIni -1;
            totSeg = (segFim + 60) - segIni;
        }
        if (horaFim == horaIni && minFim == minIni && segFim < segIni){
            totDia = numDiaFim - diaIni - 1;
            totHora  = (horaFim + 24)  - horaIni - 1;
            totMin = (minFim + 60) - minIni -1;
            totSeg = (segFim + 60) - segIni;
        }
        /*
        System.out.println(dia+" "+diaIni);
        System.out.println(horaIni+" : "+minIni+" : "+ segIni);
        System.out.println(diaFim+" "+numDiaFim);
        System.out.println(horaFim+" : "+minFim+" : "+ segFim);
        
        System.out.println(totDia+" dia(s)");
        System.out.println(totHora+" hora(s)");
        System.out.println(totMin+" minuto(s)");
        System.out.println(totSeg+" segundo(s)");
        
        */
        /*
        int i,j;
        j = 60;
        i = 1;
        while(j >= 0){
            
            System.out.println("I="+i+" J="+j);
            i = i + 3;
            j = j - 5;
        }
        */
        /*
        int i = 1, j = 7, ci = j;
        
        while( ci != (j +3) ){
            System.out.println("I= "+i+" J="+j);
            j= j-1;
        }
        i = i + 2;
        j = j + 5;
        ci = j;
        while( ci != (j +3) ){
            System.out.println("I= "+i+" J="+j);
            j= j-1;
        }
        i = i + 2;
        j = j + 5;
        ci = j;
        while( ci != (j +3) ){
            System.out.println("I= "+i+" J="+j);
            j= j-1;
        }
        i = i + 2;
        j = j + 5;
        ci = j;
        while( ci != (j +3) ){
            System.out.println("I= "+i+" J="+j);
            j= j-1;
        }
        i = i + 2;
        j = j + 5;
        ci = j;
        while( ci != (j +3) ){
            System.out.println("I= "+i+" J="+j);
            j= j-1;
        }
        */
        /*
        int i = 0, j = 1,c = 1, cj = 1;
        double I = 0, J = 1;
        while(I < 2){
            
            if(c>3){
                if (cj > 1){
                    J = J -2 - I;
                }
                c = 1;
                i = 30;
                I = (I + 0.2);
                J = J + I ;
                cj++;
            }
            
            if(I>2.0){
                break;
            }
            if(i == 0){
                System.out.println("I="+i+" J="+j);
            }else if(I == 1 || I == 2 || (I > 1.9 && I < 2.1)){
                System.out.printf("I=%.0f J=%.0f\n",I,J);
            }else{
                System.out.printf("I=%.1f J=%.1f\n",I,J);
                
            }
            
            if(c==1 && j>=3){
                J++;
            }
            if(c==2 && j>=3){
                J++;
            }
            
            
                
            j++;
            c++;
            
            
        }
        */
        /*
        Scanner tec = new Scanner(System.in);
        int n = 0, n1 , n2, soma = 0;
        n = tec.nextInt();
        for(int cc = 1;cc <= n; cc++ ){
            n1 = tec.nextInt();
            n2 = tec.nextInt();
            while(n1 > n2){
                n2 += 1;
                if((n2 % 2 != 0) && n2 != n1){
                    soma += n2;
                }
            }
            while(n1 < n2){
                n1 += 1;
                if(n1 % 2 != 0 && n2 != n1){
                    soma += n1;
                }
            }
            System.out.println(soma);
                
            
            soma = 0;  
        }
        */
        /*
        Scanner tec = new Scanner(System.in);
        int n1 = 1 , n2  = 1, soma = 0;
        do{
            n1 = tec.nextInt();
            n2 = tec.nextInt();
            if(n1 <= 0 || n2 <= 0){
                break;
            }
        if(n1 > n2){
        for(n1 = n1;n1 >= n2;n2++ ){
            System.out.print(n2+ " ");
            soma +=n2;
        }}else if(n2 > n1){
            for(n2 = n2;n2 >= n1;n1++ ){
            System.out.print(n1+ " ");
            soma +=n1;
        }
        }
        
        System.out.println("Sum="+soma);;
        soma = 0;

        }while(n1>=0 || n2 >= 0);;;;;
        */
        /*
        Scanner tec = new Scanner(System.in);
        int  cod;
        float prcVenda;
        prcVenda = tec.nextInt();
        cod = tec.nextInt();
        switch(cod){
            case 1:
                prcVenda += (prcVenda * 0.18);
                break;
            case 2:
                prcVenda += (prcVenda * 0.12);
                break;
            case 3:
                prcVenda += (prcVenda * 0.07);
                break;
            default:
                System.out.println("Código inválido.");
        }
        System.out.println("O novo preço é: "+prcVenda);
        */
        //Uri 1115
        /*
        Scanner tec = new Scanner(System.in);
        int x =1, y=1;
        while(x!=0 && y!=0){
            x = tec.nextInt();
            y = tec.nextInt();
            if(x==0 || y ==0){
                break;
            }
            if(x>0 && y>0){
                System.out.println("primeiro");
            }
            if(x<0 && y>0){
                System.out.println("segundo");
            }
            if(x>0 && y<0){
                System.out.println("quarto");
            }
            if(x<0 && y<0){
                System.out.println("terceiro");
            }
        }
        */
        //Uri 1116
        /*
        Scanner tec = new Scanner(System.in);
        int n1 = tec.nextInt();
        int x, y;
        float div ;
        for(int i = 0; i< n1; i++){
            x = tec.nextInt();
            y = tec.nextInt();
            if(y == 0){
                System.out.println("divisao impossivel");
                continue;
            }
            float a = x;
            float b = y;
            div = (a/b);
            System.out.format("%.1f\n",div);
        }
        */
        //1117
        /*
        Scanner tec = new Scanner(System.in);
        int i = 0 ;
        float n1, soma=0, media;
        while(i < 2){
            n1 = tec.nextFloat();
            if(n1<0 || n1 > 10){
                System.out.println("nota invalida");
                continue;
            }else{
                soma+=n1;
                i++;
            }
        }
        media = soma/2;
        System.out.format("media = %.2f\n",media);
        */
        Scanner tec = new Scanner(System.in);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        


    }

}
