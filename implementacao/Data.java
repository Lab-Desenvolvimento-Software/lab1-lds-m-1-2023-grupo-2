public class Data {
    private static final int[] DIASDOMES = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int ANO_ATUAL = 2022;
    private static final String[] DIASDASEMANA = new String[]{"sábado", "domingo", "segunda", "terça", "quarta", "quinta", "sexta"};
    private int dia;
    private int mes;
    private int ano;

    private void init(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if (!this.dataValida()) {
            this.dia = this.mes = 1;
            this.ano = 1900;
        }

    }

    public Data(int dia, int mes, int ano) {
        this.init(dia, mes, ano);
    }

    public Data(int dia, int mes) {
        this.init(dia, mes, 2022);
    }

    public Data() {
        this.init(1, 1, 1990);
    }

    public boolean anoBissexto() {
        boolean resposta = false;
        if (this.ano % 400 == 0) {
            resposta = true;
        } else if (this.ano % 4 == 0 && this.ano % 100 != 0) {
            resposta = true;
        }

        return resposta;
    }

    private Boolean dataValida() {
        Boolean resposta = true;
        int maximoDeDias = 0;
        if (this.ano < 1900) {
            resposta = false;
        } else if (this.mes >= 1 && this.mes <= 12) {
            maximoDeDias = DIASDOMES[this.mes];
            if (this.anoBissexto() && this.mes == 2) {
                ++maximoDeDias;
            }

            if (this.dia > maximoDeDias) {
                resposta = false;
            }
        } else {
            resposta = false;
        }

        return resposta;
    }

    public static String diaDaSemanaEm2022(String data) {
        int totalDias = 0;
        int mesParaSomar = 1;
        String[] detalhes = data.split("/");
        int dia = Integer.parseInt(detalhes[0]);
        int mes = Integer.parseInt(detalhes[1]);

        Data aux;
        for(aux = new Data(dia, mes); mesParaSomar != aux.mes; ++mesParaSomar) {
            totalDias += DIASDOMES[mesParaSomar];
        }

        totalDias += aux.dia - 1;
        int deslocamento = totalDias % 7;
        return DIASDASEMANA[deslocamento];
    }

    public String dataFormatada() {
        String var10000 = String.format("%02d", this.dia);
        return var10000 + "/" + String.format("%02d", this.mes) + "/" + String.format("%4d", this.ano);
    }

    public Data[] criarArrayData(Data data, int r, int v) {
        Data[] arraydata = new Data[v];
        arraydata[0] = data;
        Data aux = new Data(data.dia, data.mes, data.ano);

        for(int i = 1; i < v; ++i) {
            for(int j = 0; j < r; ++j) {
                ++aux.dia;
                if (!aux.dataValida()) {
                    aux.dia = 1;
                    ++aux.mes;
                }
            }

            arraydata[i] = new Data(aux.dia, aux.mes, aux.ano);
        }

        return arraydata;
    }

    public static Data desformatarData(String datanaoformatada) {
        String[] detalhes = datanaoformatada.split("/");
        int dia = Integer.parseInt(detalhes[0]);
        int mes = Integer.parseInt(detalhes[1]);
        int ano = Integer.parseInt(detalhes[2]);
        Data dataformatada = new Data(dia, mes, ano);
        return dataformatada;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }
}
