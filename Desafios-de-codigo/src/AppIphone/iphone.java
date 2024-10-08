package AppIphone;

import java.util.Scanner;

import Interfaces.internetBrowser;
import Interfaces.musicPlayer;
import Interfaces.phoneDevice;

public class iphone implements internetBrowser, musicPlayer, phoneDevice {

    @Override
    public void fazerLigacao(){
        System.out.println("Fazendo Ligação... ");
    }

    @Override
    public void atenderLigacao(){
        System.out.println("Atendendo Ligação... ");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz... ");
    }

    @Override
	public void tocarMusica() {
		System.out.println("Reproduzindo música");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Música pausada");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Musica selecionada");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		iphone device = new iphone();
		int opcao;
		do {
			System.out.println("Selecione uma opção no menu: \n 1: Efetuar ligação \n 2: Atender ligação \n 3: Iniciar correio de voz \n 4: Selecionar música \n 5: Tocar música \n 6: Pausar música \n 7: Exibir página no navegador \n 8: Abrir nova aba no navegador \n 9: Atualizar página no navegador \n 0: Desligar");

			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				device.fazerLigacao();
				Thread.sleep(1000);
				break;
			case 2:
				device.atenderLigacao();
				Thread.sleep(1000);
				break;
			case 3:
				device.iniciarCorreioVoz();
				Thread.sleep(1000);
				break;
			case 4:
				device.selecionarMusica();
				Thread.sleep(1000);
				break;
			case 5:
				device.tocarMusica();
				Thread.sleep(1000);
				break;
			case 6:
				device.pausarMusica();
				Thread.sleep(1000);
				break;
			case 7:
				device.exibirPagina();
				Thread.sleep(1000);
				break;
			case 8:
				device.adicionarNovaAba();
				Thread.sleep(1000);
				break;
			case 9:
				device.atualizarPagina();
				Thread.sleep(1000);
				break;
			case 0:
				System.out.println("Desligando o aparelho");
				Thread.sleep(900);
				break;
			default:
				System.out.println("Opção inválida. Insira um número de 0 a 9.");
				Thread.sleep(1000);
			}
		} while (opcao != 0);
		scanner.close();
	}
}
