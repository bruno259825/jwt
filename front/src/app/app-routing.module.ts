import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ValidarTokenGuard } from './guards/validar-token.guard';
import { LoginComponent } from './login/login.component';
import { EntidadesComponent } from './pages/entidades/entidades.component';
import { PagesComponent } from './pages/pages.component';
import { ProfileComponent } from './pages/profile/profile.component';


const routes: Routes = [

  {
    path: 'paginas',
    component: PagesComponent,
    children: [
      { path: 'perfil', component: ProfileComponent,canActivate:[ValidarTokenGuard] },
      { path: 'entidades', component: EntidadesComponent ,canActivate:[ValidarTokenGuard] },
      { path: '**', redirectTo: 'perfil' },
    ]
  },
  {
    path: 'login',
    component: LoginComponent,
  },
  { path: '',
    pathMatch: 'full',
    redirectTo: '/login'
  },
  { path: '**', redirectTo: 'login' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
