
// let h1 = document.getElementById("heading");
// console.log(h1);

// let h1Selector = document.querySelector("#heading");
// h1Selector.style.backgroundColor = "blue";
// console.log(h1Selector);

// let verde = document.querySelector(".verde");
// console.log(verde);
// verde.style.color = "red";

// let todosVerde = document.querySelectorAll(".verde");
// console.log(todosVerde);


// for(let i = 0; i < todosVerde.length; i++){
//     todosVerde[i].style.color = "red";
// }

// let novoArray = Array.from(todosVerde);

// console.log(novoArray);

// function teste(batata) {
//     batata.style.color = "green";
// }

// novoArray.forEach(teste)

// let link = document.getElementById("link");

// link.addEventListener("click",function(e){
//     console.log(e);
//     console.log(e.clientX);
//     console.log(e.clientY);
//     e.preventDefault()
// })

var contadora = 0;
let intervalo = setInterval(function(){
    alert("Você esperou 3 seg por esse alert");
    contadora++;
    if(contadora > 5){
        clearInterval(intervalo);
    }
;}, 3000);


// console.log(link.attributes);
// console.log(link.attributes["id"]);
// console.log(link.removeAttribute("href"));
// console.log(link.attributes);

// let botão = document.createElement("button");
// console.log(botão);

// let botao = document.createElement("botao");
// console.log(botao);

// let paragrafo = document.createTextNode(`Isso é um texto`);
// console.log(paragrafo);

// let div = document.getElementById("div1");

// div.appendChild()

// botão.appendChild(paragrafo);
// botão.textContent = "Isso não é um texto";
// botão.textContent = "Isso";
// document.getElementById("div1").innerHTML = "<h1 id='texto'>Meu nome é Mario</h1>";
// let h1 = document.getElementById("texto");

// let Leave = function(){ 
//     alert("Você digitou algo");


// div.removeChild(h1);
// h1.addEventListener("mouseleave", Leave);


// h1.removeEventListener("mouseleave", Leave);

// h1.addEventListener("click", function(){
//     alert("Eu não sou um botão");
// })