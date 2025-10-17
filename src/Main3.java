public class Main3 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Maria");
        //cuenta.saldo = 500; //genera un error
        cuenta.depositar(1500);
        cuenta.retirar(200);
        cuenta.retirar(500);
    }
}
