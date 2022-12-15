# Demonstrações

https://user-images.githubusercontent.com/36176569/207946293-ebb089e9-c1fd-4061-848d-5754f0b19989.mp4

https://user-images.githubusercontent.com/36176569/207946331-844d2665-62c8-48ee-82f9-fff778966f6e.mp4

https://user-images.githubusercontent.com/36176569/207946441-ae07e6ea-be9a-444e-b0c4-bd514201d60d.mp4

https://user-images.githubusercontent.com/36176569/207946454-82576883-009b-4d21-80a5-773a6ed7ba64.mp4

# Objetivo do Projeto

O principal e único objetivo desse projeto era ver até que ponto a [inteligência artificial da **OpenAI**](https://beta.openai.com/playground) poderia criar um aplicativo Android "totalmente do 0" com apenas algumas instruções.
Apesar de simples, o app não é tão trivial: ele usa ViewModel, Repository, faz consumo de API e tem carregamento de imagens. É utilizada a [API do Imgflip](https://imgflip.com/api).

No geral, meu objetivo era fazer com que a IA criasse toda a base de código e que eu utilizasse sempre a primeira alternativa de código que ela criasse. Em poucos casos, como em um que você pode observar nos vídeos, eu peço para ela refatorar ou mudar o código que gerou anteriormente.
***A ideia era que eu pedisse, ela criasse e eu usasse. Simples e rápido!***

Isso também significa que não dei muitas chances de melhoria para ela, em questões de layout (como uma adição de uma barra de progresso ao carregar os dados) ou código em si, uma vez que a ideia era apenas ter uma aplicação funcional.

Apesar de poder tentar, eu quis dar instrução por instrução para ver como ela se saía em cada caso, ao invés de pedir algo abstrato e mais complexo como "crie um app que consuma a API... bla bla bla".

## O que eu fiz / O que a IA fez

Antes de começar a dar instruções e obter os códigos gerados pela IA, eu já havia adicionado algumas bibliotecas que eu sabia que seriam necessárias no projeto, como a biblioteca **Retrofit**, para chamadas à API, e a **Coil**, para carregamento de imagens. Por conta disso, não pedi instruções em relação a nada envolvendo a adição de bibliotecas no **build.gradle**.

Todos os códigos de classes e layouts foram gerados pela IA. Meu único trabalho foi dar alguns imports e, em alguns momentos, fazer pequenas correções de nomes errados de variáveis. Todos os nomes de classes e variáveis foram criados pela IA, em pouquíssimas exceções tive que fazer alterações para corrigir problemas.
Em raros casos tive que corrigir o código em si. Um exemplo disso foi quando tive que mudar a parte do adapter da RecyclerView, pois ela criou um código usando a biblioteca **Glide** ao invés da **Coil**, porém isso aconteceu porque não pedi exatamente que tipo de biblioteca deveria ser utilizada para carregar imagens.

Eu também tentei seguir um pouco do **padrão MVVM** ao criar o projeto, mas essa não era a ideia principal.

## Problemas?

Eu confesso que pensei que teria bem mais problemas do que tive. Em raros casos ela criou códigos que não funcionavam e quando o fez, logo pedi alternativas que funcionaram rapidamente, então posso dizer que no geral tive muitos poucos problemas.

## Download do app

Você pode testar o app por conta própria acessando as [releases](https://github.com/jsericksk/MemesApp-AI/releases) desse repositório.

## Conclusão

Foi um projeto muito divertido de fazer. Considerando o potencial dessa IA, não preciso falar mais nada. Tire suas próprias conclusões.

E não, eu não usei o **ChatGPT** para criar esse readme! (Será?)







