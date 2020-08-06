

// var form = document.forms[0];

// var elementos = form.elements;
// console.log(form);
// console.log(elementos);


// console.log(form.action);
// console.log(elementos[0].value);


// form.onsubmit = function(event){
//     alert('Confirmou');
//     event.preventDefault();
// }

// form.oncopy = function(event){
//     alert('Copiou');
// }

// var radio = document.querySelector('#radio1:checked')

// console.log(elementos[3].options[1].value);

// elementos[3].addEventListener('change', function(){
//     console.log(elementos[3].options[elementos[3].selectedIndex].value);    
// })


// elementos[0].addEventListener('input', function(){
//     if(elementos[0].value.length === 0){
//         console.log("vazio");
//         alert('Valor vazio');
//     }else{
//         console.log("não está vazio");
//     }
// })

// var objetoJson = {"valor1" : "mario", 'mario': 'nome'};

// var novoJson = JSON.stringify(objetoJson);

// console.log(novoJson);

// var oldJson = JSON.parse(novoJson);

// console.log(oldJson);

// var xmlhttp = new XMLHttpRequest();

// xmlhttp.onreadystatechange = function(){
//     if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
//         console.log(xmlhttp.responseText)
//     }
// }

// xmlhttp.open("GET", "informacoes.txt", true);
// xmlhttp.send()

// var httppost = new XMLHttpRequest();

// httppost.open("POST", "informacoes.txt", true);

// httppost.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

// var params = "texto não tão util assim";

// httppost.send(params);



// var ob1 = {produto: "macarrao", preco: 14}
// var ob2 = {produto: "arroz", preco: 14}
// var ob3 = {produto: "feijao", preco: 34}
// var ob4 = {produto: "carne", preco: 62}

// var array = [ob1, ob2, ob3, ob4];



// var novoPreco = array.reduce(function(total, value){
    
//     return total += value.preco;
// },0)

// var novoPreco = array.map(p => p.preco).reduce((total,preco)=> total+=preco)


// console.log(novoPreco);





var verificaPrimo = numero =>{
    var cont = 2;
    console.log(numero);
    if(numero < 4 && numero >= 0){
        console.log("primo");
        return ;
    }
    
    if(numero % 2 == 0){
        console.log("não é primo");
        return ;
    }
    while( cont <= numero/2){
        if(numero % cont == 0){
            console.log("não é primo")
            return ;
        }
        cont++;
    }

    console.log("É Primo");
    return ;    
}


verificaPrimo(9);
verificaPrimo(2);
verificaPrimo(3);
verificaPrimo(4);
verificaPrimo(5);
verificaPrimo(6);
verificaPrimo(7);
verificaPrimo(11);
verificaPrimo(17);