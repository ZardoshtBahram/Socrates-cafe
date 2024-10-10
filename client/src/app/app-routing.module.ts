import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from '@app/aboutus/aboutus.component';
import { ContentComponent } from '@app/content/content.component';
import { LoginComponent } from '@app/login/login.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent, title: 'Home' },
  { path: 'login', component: LoginComponent, title: 'Login' },
  { path: '', component: HomeComponent, title: 'Home' },
  { path: 'article', component: ContentComponent, title: 'Content' },
  { path: 'aboutus', component: AboutusComponent, title: 'About us' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
