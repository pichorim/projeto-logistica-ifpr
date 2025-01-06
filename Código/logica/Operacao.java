public class Operacao extends Conexao{
    private Select s = new Select();
    private Insert i = new Insert();
    private Update u = new Update();
    private Delete d = new Delete();
    private String tabela;
    private int op;

    public void operacao(){
        op = 1;
        while(op != 0){
            System.out.println("\nDigite:\n1: Select\n2: Insert\n3: Update\n4: Delete\n");
            op = sc.nextInt(); sc.nextLine();
            System.out.println("\nEscolha a tabela:\n");
            tabela = sc.nextLine();
            switch (op) {
                case 1:
                    s.select(tabela);
                    break;
                case 2:
                    i.insert(tabela);
                    break;
                case 3:
                    u.update(tabela);
                    break;
                case 4:
                    d.delete(tabela);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}