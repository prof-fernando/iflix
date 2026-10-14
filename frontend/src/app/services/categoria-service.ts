import { HttpClient } from '@angular/common/http';
import { inject, Service } from '@angular/core';

@Service()
export class CategoriaService {

     http:HttpClient = inject(HttpClient);

    listarCategorias(){
       return this.http.get('http://localhost:8080/categoria');
    }
}
