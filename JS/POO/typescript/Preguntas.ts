export class Preguntas {
    pregunta: string;
    respuestaCorrecta: string;
    respuestaIncorrecta1: string;
    respuestaIncorrecta2: string;
    respuestaIncorrecta3: string;

    constructor(pregunta: string, respuestaCorrecta: string, respuestaIncorrecta1: string, respuestaIncorrecta2: string,respuestaIncorrecta3: string) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
        this.respuestaIncorrecta1 = respuestaIncorrecta1;
        this.respuestaIncorrecta2 = respuestaIncorrecta2;
        this.respuestaIncorrecta3 = respuestaIncorrecta3;
    }
}
