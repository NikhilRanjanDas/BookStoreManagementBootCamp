import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ViewcustomerComponent } from './viewcustomer/viewcustomer.component';

const routes: Routes = [
  { path: 'view', component: ViewcustomerComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [ViewcustomerComponent]
