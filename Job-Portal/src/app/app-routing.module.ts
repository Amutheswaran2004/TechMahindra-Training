import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { JobListComponent } from './components/job-list/job-list.component';
import { JobDetailComponent } from './components/job-detail/job-detail.component';
import { CompanyProfileComponent } from './components/company-profile/company-profile.component';  // Import CompanyDetailComponent
import { LoginComponent } from './components/login/login.component';
import { UserProfileComponent } from './components/user-profile/user-profile.component';

const routes: Routes = [
  { path: '', redirectTo: '/jobs', pathMatch: 'full' },
  { path: 'jobs', component: JobListComponent },
  { path: 'job/:id', component: JobDetailComponent },
  { path: 'company/:id', component: CompanyProfileComponent }, 
  { path: 'login', component: LoginComponent },
  { path: 'user/:id', component: UserProfileComponent },
  { path: '**', redirectTo: '/jobs' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
