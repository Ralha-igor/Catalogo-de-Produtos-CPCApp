#CPC App - Catálogo de Peças de Computador


> Projeto Android desenvolvido como parte do curso de Desenvolvimento Mobile no IFSP

## Descrição
*Um aplicativo web moderno para catálogo de peças de computador com suporte a múltiplos idiomas e temas.*

### Funcionalidades
- ✨ Características Principais 
- 🌐 Suporte Multi-idioma: Português e Inglês 
- 🎨 Temas: Modo escuro e claro 
- 📱 Design Nativo Android: Interface fluida e responsiva 
- 🔍 Catálogo Organizado: Visualização fácil das peças de PC 
- 📋 Detalhes Completos: Activity dedicada para cada componente 
- 📤 Compartilhamento: Funcionalidade nativa de compartilhar peças 
- ⚡ Performance Otimizada: Desempenho suave com Kotlin

## Tecnologias Utilizadas
✨Tecnologias Utilizadas Android Studio - IDE principal Kotlin - Linguagem de programação (100%) XML - Layout das interfaces Android SDK - Framework nativo Material Design - Componentes de UI modernos

✨Activities Principais MainActivity - Lista principal do catálogo PartDetailActivity - Tela de detalhes das peças SettingsActivity - Configurações de tema e idioma
---  *** 

## ✨Estrutura do Projeto
'''
 app/
└── src/main/
├── java/com/example/cpcapp/
│ ├── ui/
│ │ ├── MainActivity.kt
│ │ └── DetalhesActivity.kt
│ ├── adapter/
│ │ └── PecaAdapter.kt
│ └── model/
│ └── Peca.kt
├── res/
│ ├── layout/
│ │ ├── activity_main.xml
│ │ ├── activity_detalhes.xml
│ │ └── item_peca.xml
│ ├── values/
│ │ ├── strings.xml (inglês)
│ │ ├── colors.xml
│ ├── values-pt-rBR/
│ │ └── strings.xml (português)
│ └── drawable/
│ ├── processador.png
│ ├── placa_mae.png
│ └── ...
└── AndroidManifest.xml
'''

## Status
*✔ Concluído - protótipo funcional com lista de peças de computadores, tela de detalhes e ações
nativas do sistema.*

## Aprendizados e Desafios
- Uso adequado do ciclo de vida das Activities
- Troca de dados usando putExtra e Serializable
- Diferença entre Intent.ACTION_VIEW e ACTION_SENDTO
- Adição de nova Activity no Manifest sem causar crash


## Instalação 
<pre>
git clone https://github.com/Ralha-igor/Catalogo-de-Produtos-CPCApp.git
cd CPCApp-app
./gradlew build
</pre>

## Licença
Este código está licenciado sobre a GPLv3 (GNU General Public License v3)

## Sobre mim
Me chamo Igor Ralha, sou estudante do IFSP - CAMPUS ARARAQUARA desde 2024

## Contato
- [Meu LinkedIn](https://www.linkedin.com/in/igor-ralha-b6867a284/)
- [Currículo em PDF]()
- [Portfólio Web]()

## Demonstração
*Acessar Vídeo do aplicativo*
 [![assista no github](https://github.com/user-attachments/assets/2d0181a4-7619-4724-8eb4-e68d0c4c2b95)]
 [![Assista no Youtube](https://youtube.com/shorts/nxIsXTWWBTE?feature=share)]
![alt](<img width="1080" height="2400" alt="Ingles" src="https://github.com/user-attachments/assets/2ba3d500-db33-4730-a0a5-eb2b28324b12" />)
![alt](<img width="1080" height="2400" alt="ingles e branco 2" src="https://github.com/user-attachments/assets/ef76b568-bc32-4235-ac20-aba45e6f0d30" />)
![alt](<img width="1080" height="2400" alt="portugues e preto " src="https://github.com/user-attachments/assets/e70850a0-575a-4a13-a1ff-e62bfabdd5aa" />)
![alt](<img width="1080" height="2400" alt="portugues e preto 2" src="https://github.com/user-attachments/assets/0b41c50c-7c26-408b-96e7-eddaa131d680" />)
![alt](<img width="1080" height="2400" alt="portugues e preto 3" src="https://github.com/user-attachments/assets/5c930b7c-c56e-4f78-b632-3a96160adee6" />)

