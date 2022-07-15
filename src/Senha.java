package crescerEstudos;

public class Senha {
	
	// implementando uma função que recebe uma string e implementa validações para garantir a complexidade da senha.
	
	public int validaComplexidade(String senha) {
		int complexo = 0;
		int lower = 0;
		int upper = 0;
		int numero = 0;
		int proibidos = 0;
		
		if (senha.length() >= 8 && senha.length() <= 32) {
		
		// verifica caractere por caractere se a senha possui letras minúsculas, maiúsculas e números.
			
		for (int i = 0; i < senha.length(); i++) {
			
			char c = senha.charAt(i);
			
			if (Character.isLowerCase(c)) {
				lower++;
			}
			
			if (Character.isUpperCase(c)) {
				upper++;
			}
			
			if (Character.isDigit(c)) {
				numero++;
			}
			
			if (lower > 0 && upper > 0 && numero > 0) {
				complexo++;
				break;
			}
			
			
		}
		
		// verifica caractere por caractere se a senha possui caracteres especiais ou espaços.
		
		for (int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);
		
			if (!Character.isLetterOrDigit(c)) {
			proibidos++;
			}
		
			if (Character.isSpaceChar(c)) {
			proibidos++;
			}
			
			if (proibidos > 0) {
				complexo--;
				break;
			}
	}
		}
		
		if (complexo == 1) {
			return 1;
		} else return 0;
		
		
	}

}
