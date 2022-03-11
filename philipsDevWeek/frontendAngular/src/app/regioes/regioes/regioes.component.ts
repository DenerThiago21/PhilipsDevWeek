import { Component, OnInit } from '@angular/core';
import { Regiao } from '../model/regiao';
import { RegiaoService } from '../service/regiao.service';

@Component({
  selector: 'app-regioes',
  templateUrl: './regioes.component.html',
  styleUrls: ['./regioes.component.css']
})
export class RegioesComponent implements OnInit {

  regioes: Regiao[] = [];

  constructor(private regiaoService:RegiaoService) { }

  ngOnInit(): void {
    this.regioes = this.regiaoService.listRegioes();
  }

}
