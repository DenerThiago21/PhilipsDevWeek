import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegioesComponent } from './regioes/regioes.component';

const routes: Routes = [
  {
    path: '',
    component: RegioesComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class RegioesRoutingModule { }
