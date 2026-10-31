import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class dados {
	String servico;
	String nome;
    double preco;
    String fun_nome;
    
    public dados() {};
    
    public dados(String servico, String nome, double preco, String fun_nome) {
    	this.servico = servico;
    	this.nome = nome;
        this.preco = preco;
        this.fun_nome = fun_nome;
    }
}

public class servicosLocais {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        String servico = "";
        String nome = "";
        double preco = 0.0;
        String fun_nome = "";
        
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("HH:mm");
        
        LocalTime horarioAgora = LocalTime.now();
        System.out.println(horarioAgora);
        
        System.out.println("=========================================");
        System.out.println("|    VALIDAÇÃO DE DADOS EM ANDAMENTO    |");
        System.out.println("=========================================");
        
        System.out.print("SERVIÇO?: ");
        servico = sc.nextLine();
        
        System.out.print("NOME: ");
        nome = sc.nextLine();
        
        System.out.print("PREÇO: ");
        preco = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("QUEM IRA REALIZAR SEU SERVIÇO? ");
        fun_nome = sc.nextLine();
        
        System.out.println(" DADOS SALVOS ! ");
        
        System.out.println("VALIDAÇÃO DE PRAZO E ENTREGA ");
        
        System.out.print("AGENDAR QUAL HORARIO: ");
        LocalTime prazo = LocalTime.parse(sc.nextLine());
        
        dados db = new dados(servico, nome, preco, fun_nome);
        
        System.out.println(" AGENDADO ! ");
        System.out.println("CONFIRA OS DADOS ABAIXO: ");
        System.out.println(" | SERVIÇO: " + db.servico + " | ");
        System.out.println(" | NOME: " + db.nome + " | ");
        System.out.println(" | VALOR: " +  db.preco + " | ");
        System.out.println(" | NOME DE QUEM IRA REALIZAR O SERVIÇO: " + db.fun_nome + " | ");
        
        System.out.print("Confirma? ");
        String confirma = sc.nextLine();
        
        if(confirma.equals("sim")) {
        	System.out.println("PERFEITO ! VAMOS PROSSEGUIR COM PAGAMENTO ! ");
            System.out.print("pagar agora? ");
            String pix_now_or_no1 = sc.nextLine();
            if(pix_now_or_no1.equals("sim")) {
            	System.out.println("SEGUE CHAVE ABAIXO: ");
                System.out.println("[CHAVE_ALEATORIA]");
                System.out.print("PAGOU? ");
                String pago_or_no = sc.nextLine();
                if(pago_or_no.equals("sim")) {
                	System.out.println("OBRIGADO POR CONFIAR EM NOSSOS SERVIÇOS DESEJAMOS BOA SORTE ! ");
                }
                else {
                	System.out.println("[ERROR_PAY_TO_FAILED!!!]");
                }
            }
            else if(pix_now_or_no1.equals("não")) {
            	System.out.println("A [NOME_EMPRESA] AGRADEÇE E TENHA UM OTIMO SERVIÇO DE NOSSO FUNCIONARIOS, BOA SORTE ! ");
            }
            else {
            	System.out.println(" [ ERROR... ] ");
            }
        }
        
        else if(confirma.equals("não")) {
        	System.out.println("retornando para a estaca 0...");
            System.out.println(" CARREGANDO... ");
        }
        else {
        	System.out.println(" [ ERRORS... ] ");
        }
        
        System.out.println("SEGUE AVALIAÇÃO ABAIXO: ");
        System.out.print("O QUE ACHOU DO SERVIÇO? ");
        int avaliacao1 = sc.nextInt();
        sc.nextLine();
        if(avaliacao1 == 1) {
        	System.out.print("O QUE HOUVE? ");
            String sit1 = sc.nextLine();
            System.out.println("seu comentario: " + sit1 + "OBRIGADO POR COMPARTILHAR CONTAMOS COM SUA AVALIAÇÃO PARA MELHORAR NOSSOS SERVIÇOES E GARANTIR O MELHOR RESULTADO PARA VOCÊ JUNTO COM NOSSA EMPRESA E EQUIPE ! ");
        }
        else if(avaliacao1 == 2) {
        	System.out.print("O QUE HOUVE? ");
            String sit2 = sc.nextLine();
            System.out.println("seu comentario: " + sit2 + "OBRIGADO POR COMPARTILHAR CONTAMOS COM SUA AVALIAÇÃO PARA MELHORAR NOSSOS SERVIÇOES E GARANTIR O MELHOR RESULTADO PARA VOCÊ JUNTO COM NOSSA EMPRESA E EQUIPE ! ");
        }
        else if(avaliacao1 == 3) {
        	System.out.print("O QUE HOUVE? ");
            String sit3 = sc.nextLine();
            System.out.println("seu comentario: " + sit3 + "OBRIGADO POR COMPARTILHAR CONTAMOS COM SUA AVALIAÇÃO PARA MELHORAR NOSSOS SERVIÇOES E GARANTIR O MELHOR RESULTADO PARA VOCÊ JUNTO COM NOSSA EMPRESA E EQUIPE ! ");
        }
        else if(avaliacao1 == 4) {
        	System.out.print("QUE BOM QUE GOSTOU!! COMENTE ABAIXO O QUE PODEMOS MELHORAR ! ");
            String sit4 = sc.nextLine();
            System.out.println("seu comentario: " + sit4 + "OBRIGADO POR COMPARTILHAR CONTAMOS COM SUA AVALIAÇÃO PARA MELHORAR NOSSOS SERVIÇOES E GARANTIR O MELHOR RESULTADO PARA VOCÊ JUNTO COM NOSSA EMPRESA E EQUIPE ! ");
        }
        else if(avaliacao1 == 5) {
        	System.out.print("QUE BOM QUE MARCOU EXCELENTE ISSO AJUDA MUITO!! COMENTE ABAIXO O QUE PODEMOS MELHORAR ! ");
            String sit5 = sc.nextLine();
            System.out.println("seu comentario: " + sit5 + "OBRIGADO POR COMPARTILHAR CONTAMOS COM SUA AVALIAÇÃO PARA MELHORAR NOSSOS SERVIÇOES E GARANTIR O MELHOR RESULTADO PARA VOCÊ JUNTO COM NOSSA EMPRESA E EQUIPE ! ");
        }
        else {
        	System.out.println(" [ ERROR_FAILED_AVAL... ] ");
        }

        System.out.println(" ( RECLAMAÇÕES ) ");
        
        System.out.print("QUER RELATAR ALGO QUE POSSA TER TE IMCOMODADO OU TA TUDO BEM? ");
        String relato_cliente = sc.nextLine();
        if(relato_cliente.equals("sim")) {
        	System.out.print("COMENTARIO: ");
            String comment1 = sc.nextLine();
            sc.nextLine();
            System.out.println("SEU COMENTARIO: [" + comment1 + "] OBRIGADO POR SUA QUEIXA, IREMOS REPASSAR PARA O DEPARTAMENTO PARA REGISTRAR ISSO COM CALMA E EXIGIR DETALHES DO LADO OPOSTO, FIQUE TRANQUILO(A), O RESULTADO NÃO IRÁ TE AFETAR OU TE ATRAPALHAR EM SUA VIDA PESSOAL OU PROFISSIONAL ! ");
        }
        else {
        	System.out.println(" [ ERROR_COMENT_FAILED... ] ");
        }
    }
}