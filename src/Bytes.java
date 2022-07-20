package crescerCWI;

public class Bytes {
	
	String tamanhoArquivo(long tamanho) {
		double tamanhod = tamanho;
		
		if(tamanho < 1024) {
			return String.valueOf(String.format("%.2f", tamanhod)) + " B";
		} else if(tamanho >= 1024 && tamanho < Math.pow(1024, 2)) {
			return String.valueOf(String.format("%.2f", tamanhod / 1024)) + " KB";
		} else if(tamanho >= Math.pow(1024, 2) && tamanho < Math.pow(1024, 3)) {
			return String.valueOf(String.format("%.2f", (tamanhod / Math.pow(1024, 2)))) + " MB";
		} else if(tamanho >= Math.pow(1024, 3) && tamanho < Math.pow(1024, 4)) {
			return String.valueOf(String.format("%.2f", (tamanhod / Math.pow(1024, 3)))) + " GB";
		} else if(tamanho >= Math.pow(1024, 4) && tamanho < Math.pow(1024, 5)) {
			return String.valueOf(String.format("%.2f", (tamanhod / Math.pow(1024, 4)))) + " TB";
		} else if(tamanho >= Math.pow(1024, 5) && tamanho < Math.pow(1024, 6)) {
			return String.valueOf(String.format("%.2f", (tamanhod / Math.pow(1024, 5)))) + " PB";
		} else if(tamanho >= Math.pow(1024, 6) && tamanho < Math.pow(1024, 7)) {
			return String.valueOf(String.format("%.2f", (tamanhod / Math.pow(1024, 6)))) + " EB";
		} else if(tamanho >= Math.pow(1024, 7) && tamanho < Math.pow(1024, 8)) {
			return String.valueOf(String.format("%.2f", (tamanhod / Math.pow(1024, 7)))) + " ZB";
		} else if(tamanho >= Math.pow(1024, 8) && tamanho < Math.pow(1024, 9)) {
			return String.valueOf(String.format("%.2f", (tamanhod / Math.pow(1024, 8)))) + " YB";
		} else {
			return "Valor indefinido";
		}
	}

}