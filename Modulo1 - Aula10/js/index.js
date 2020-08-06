const elemento1 = $("div");
// elemento1.css("background-color", "red");
// $(".primeiro").removeClass("")


//  elemento1.html("<h2>Hoje é quarta</h2>");
//  elemento1.text("<h2>Amanhã é quinta</h2>");

// elemento1.hide();
// elemento1.show();

//elemento1.before("<h2>Hoje é quarta</h2>");
//elemento1.after("<h2>Amanhã é quinta</h2>");

// elemento1.wrap("<h2>Hoje é quarta</h2>");

// elemento1.empty();

// elemento1.remove();


// elemento1.attr("id", "primeiroAgain");

function alerta(){
    alert("Você clicou em mim");
}

function adicionarTexto(){
    elemento1.append("<h3>Fui adicionado ao clicar<h3>");
}

// elemento1.on("click", alerta);
// elemento1.on("click", adicionarTexto);
// elemento1.one("mouseleave", alerta);
// elemento1.off("click");
// elemento1.prepend("<h2>Segundo Trecho</h2>");

// console.log(elemento1);


$(document).ready(function(){

    $("#painel").click(function(){
        $("#info").slideToggle("slow");
    });


    $("#button").click(function(){
        var div2 = $("#segundo");
        div2.animate({height: '100px', opacity: 0.4}, "slow");
        div2.animate({width: '100px', opacity:0.8}, "slow");
        div2.animate({height: '150px', opacity: 0.4}, "slow");
        div2.animate({width: '150px', opacity:1}, "slow");
    });

    $("#botaoAjax1").click(function(){
        $("#p1").load("test.txt");
    });

    $("#botaoAjax2").click(function(){
        $.get("https://dog.ceo/api/breeds/image/random", function(data, status){
            alert("Data: " + data + "\nStatus: " + status);
            console.log(data);
            const image = data.message;
            $("#terceiro").append('<image src="' + image + '" alt="test" >');  
        });
    });

    $("#botaoAjax3").click(function(){
        $.post("test.txt",
        {
            name: "Donald Duck",
            city: "Duckburg"
        },
        function(data, status){
        alert("Data: " + data + "\nStatus: " + status);
        });
    });

});

