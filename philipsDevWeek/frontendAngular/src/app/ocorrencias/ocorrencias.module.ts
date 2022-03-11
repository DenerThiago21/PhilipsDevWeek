import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RegioesRoutingModule } from './ocorrencias-routing.module';
import { OcorrenciasComponent } from './ocorrencias/ocorrencias.component';
import { MatSortModule } from  '@angular/material/sort';
import { MatCardModule } from '@angular/material/card';


@NgModule({
  declarations: [
    OcorrenciasComponent
  ],
  imports: [
    CommonModule,
    RegioesRoutingModule,
    MatSortModule,
    MatCardModule
  ]
})
export class OcorrenciasModule { }
