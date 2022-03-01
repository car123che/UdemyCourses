var nota1, nota2, promedio;
nota1 = parseFloat(prompt("Ingrese la nota parcial: "));
nota2 = parseFloat(prompt("Ingrese la nota final: "));

promedio = ( nota1 + nota2 ) /  2;

if(promedio <= 10.5){
    alert("REPROBADO");
}else{
    alert("APROBADO");
}