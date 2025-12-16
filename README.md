#CPC App - Catálogo de Peças de Computador


> Projeto Android desenvolvido como parte do curso de Desenvolvimento Mobile no IFSP

## Descrição
*Um aplicativo Android moderno para catálogo de peças de computador, com suporte a múltiplos idiomas (Português e Inglês) e temas (claro e escuro), proporcionando navegação fluida e interface intuitiva para visualização e gerenciamento das peças.*

### Funcionalidades
	✨ Catálogo de Peças: Visualização organizada de componentes de PC
 	🌐 Suporte Multi-idioma: Português e Inglês
	🎨 Temas Escuro e Claro: Alternância fácil para diferentes condições de iluminação
	📱 Interface Nativa Android: Layout responsivo e fluido
	📋 Detalhes Completos: Activity dedicada para cada peça com informações completas
	📤 Compartilhamento: Possibilidade de compartilhar informações de peças diretamente
	⚡ Performance Otimizada: Desempenho suave utilizando Kotlin e RecyclerView
	🔍 Pesquisa e Filtro: Localização rápida de peças no catálogo

## Tecnologias Utilizadas
✨Tecnologias Utilizadas Android Studio - IDE principal Kotlin - Linguagem de programação (100%) XML - Layout das interfaces Android SDK - Framework nativo Material Design - Componentes de UI modernos

✨Activities Principais MainActivity - Lista principal do catálogo PartDetailActivity - Tela de detalhes das peças SettingsActivity - Configurações de tema e idioma - CadastroActivity – Formulário para adicionar novas peças
---  *** 
```
## ✨Estrutura do Projeto
app/
 └── src/main/
     ├── java/com/example/cpcapp/
     │   ├── adapter/
     │   │   └── PecaAdapter.kt
     │   ├── data/
     │   │   ├── dao/
     │   │   │   └── LocalDao.kt
     │   │   └── database/
     │   │       └── AppDatabase.kt
     │   ├── model/
     │   │   └── Peca.kt
     │   └── ui/
     │       ├── MainActivity.kt
     │       ├── DetalhesActivity.kt
     │       └── CadastroActivity.kt
     │
     ├── res/
     │   ├── drawable/
     │   │   ├── processador.png
     │   │   ├── placa_mae.png
     │   │   └── ...
     │   ├── layout/
     │   │   ├── activity_main.xml
     │   │   ├── activity_detalhes.xml
     │   │   ├── activity_cadastro.xml
     │   │   └── item_peca.xml
     │   ├── values/
     │   │   ├── strings.xml
     │   │   ├── colors.xml
     │   ├── values-pt-rBR/
     │   │   └── strings.xml
     └── AndroidManifest.xml





```
## Status
*✔ Concluído - protótipo funcional com catálogo completo de peças de computador, tela de detalhes detalhada e integração com as ações nativas do sistema.*

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

[▶️ Assista no YouTube demonstração do app ](https://www.youtube.com/shorts/0WNwY_A2MNc)

[▶️ Assista no YouTube explicação do código](https://www.youtube.com/watch?v=NzFYm57QolQ)

https://github.com/user-attachments/assets/d3d34bf7-12dd-40f3-957d-32a6bd2fb076

---

### 🖼️ Telas do Aplicativo

#### ☀️ Modo claro 
<p align="center">
<img src="https://github.com/Ralha-igor/Catalogo-de-Produtos-CPCApp/blob/main/docs/Tela%20principal.jpeg" width="250" />
<img src="https://github.com/Ralha-igor/Catalogo-de-Produtos-CPCApp/blob/main/docs/cadastro%20de%20pecas.jpeg%20(codifica%C3%A7%C3%A3o%20inv%C3%A1lida)" width="250" />
<img width="250" height="1080" alt="visualizando-pecas" src="https://github.com/user-attachments/assets/0bef7fce-120b-4eb0-9c0f-9b0a4264240d" />
</p>

#### 🌙 Modo escuro 
<p align="center">
  <img src="https://github.com/user-attachments/assets/4a675000-6539-4df8-ad57-246e69c7166e" width="250" />
  <img src="https://github.com/user-attachments/assets/cf65d03c-814e-41a5-ad44-5bb68b124762" width="250" />
  <img src="https://github.com/user-attachments/assets/07f0515d-752d-4613-b550-74f8863bb44f" width="250" />
</p>





