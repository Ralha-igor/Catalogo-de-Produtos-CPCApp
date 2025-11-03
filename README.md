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
```
## ✨Estrutura do Projeto
app/
 └── src/main/
     ├── java/com/example/cpcapp/
     │   ├── ui/
     │   │   ├── MainActivity.kt
     │   │   └── DetalhesActivity.kt
     │   ├── adapter/
     │   │   └── PecaAdapter.kt
     │   └── model/
     │       └── Peca.kt
     ├── res/
     │   ├── layout/
     │   │   ├── activity_main.xml
     │   │   ├── activity_detalhes.xml
     │   │   └── item_peca.xml
     │   ├── values/
     │   │   ├── strings.xml (inglês)
     │   │   ├── colors.xml
     │   ├── values-pt-rBR/
     │   │   └── strings.xml (português)
     │   └── drawable/
     │       ├── processador.png
     │       ├── placa_mae.png
     │       └── ...
     └── AndroidManifest.xml

```
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
## 🎥 Demonstração

*Acessar vídeo do aplicativo:*  

[▶️ Assista no YouTube](https://youtube.com/shorts/nxIsXTWWBTE?feature=share)

https://github.com/user-attachments/assets/2d0181a4-7619-4724-8eb4-e68d0c4c2b95  

---

### 🖼️ Telas do Aplicativo

#### ☀️ Modo claro (Inglês)
<p align="center">
  <img src="https://github.com/user-attachments/assets/f62a7409-b452-450f-9745-afd1b849f80b" width="250" />
  <img src="https://github.com/user-attachments/assets/09dee901-c058-4ed3-858b-134a583307f9" width="250" />
</p>

#### 🌙 Modo escuro (Português)
<p align="center">
  <img src="https://github.com/user-attachments/assets/4a675000-6539-4df8-ad57-246e69c7166e" width="250" />
  <img src="https://github.com/user-attachments/assets/cf65d03c-814e-41a5-ad44-5bb68b124762" width="250" />
  <img src="https://github.com/user-attachments/assets/07f0515d-752d-4613-b550-74f8863bb44f" width="250" />
</p>



