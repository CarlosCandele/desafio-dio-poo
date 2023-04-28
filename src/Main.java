import br.com.dio.desafio.Curso;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescriocao("Java Orientado a objeto");
        curso.setCargaHoraria(145);

        System.out.println(curso);
    }
}
