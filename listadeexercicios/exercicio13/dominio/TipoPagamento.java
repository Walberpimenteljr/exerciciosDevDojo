package listadeexercicios.exercicio13.dominio;

public enum TipoPagamento {
    AVISTA_PIX{
       @Override
        public double calcularDesconto(double preco){
            return preco-preco*0.15;
       }
    }
    ,AVISTA_CREDITO{
        @Override
        public double calcularDesconto(double preco){
            return preco-preco*0.10;
        }

    }
    ,PARCELADO_DUASVEZES{
        @Override
        public double calcularDesconto(double preco) {
            return preco;
        }
    }
    ,PARCELADO_TRESVEZES{
        @Override
        public double calcularDesconto(double preco) {
            return  preco+preco*0.10 ;
        }
    };

    public abstract double calcularDesconto(double preco);

}
