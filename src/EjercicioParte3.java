class CuentaBancaria{
    private double saldo = 0;
    private String titular;
    public CuentaBancaria(String titular){
        this.titular= titular;
    }
    public void depositar(double monto){
        if (monto >0){
            saldo += monto;
            System.out.println("Deposito exitoso " + saldo);
        }else{
            System.out.println("Monto invalido");
        }
    }
    public void retirar(double monto){
        if (monto >0 && monto <=saldo){
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $ " +saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public double getSaldo(){
        return saldo;
    }
}
