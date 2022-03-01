var euros, dolares, quetzales;

euros = parseFloat(prompt("Ingresa la cantidad en euros: "));
dolares = euros * 1.13;
quetzales = euros * 8.75;

document.write("-Euros:" + euros + " -Dolares:" + dolares + " -Quetzales:" + quetzales );