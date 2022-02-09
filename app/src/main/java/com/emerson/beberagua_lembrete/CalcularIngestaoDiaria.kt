package com.emerson.beberagua_lembrete

class CalcularIngestaoDiaria {

    private val ml_jovem = 40.0
    private val ml_adulto = 35.0
    private val ml_idoso = 30.0
    private val ml_mais_de_66_anos = 25.0

    private var resultadoML = 0.0
    private var resultado_total_ml = 0.0

    fun CalcularTotalMl(peso:Double, idade : Int){

        if(idade<= 17){
            resultadoML = peso * ml_jovem
            resultado_total_ml = resultadoML
        }else if(idade <= 55){
            resultadoML = peso * ml_adulto
            resultado_total_ml = resultadoML
        }else if(idade <= 65) {
            resultadoML = peso * ml_idoso
            resultado_total_ml = resultadoML
        }else{
            resultadoML = peso * ml_mais_de_66_anos
            resultado_total_ml = resultadoML
        }
    }

    fun ResultadoMl():Double{
        return resultado_total_ml
    }
}