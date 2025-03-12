import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule, FormsModule } from '@angular/forms'; // For Template and Reactive Forms
import { HttpClientModule } from '@angular/common/http'; // For API Calls & Observables

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { JobListComponent } from './components/job-list/job-list.component';
import { JobDetailComponent } from './components/job-detail/job-detail.component';
import { CompanyProfileComponent } from './components/company-profile/company-profile.component';
import { UserProfileComponent } from './components/user-profile/user-profile.component';
import { JobItemComponent } from './components/job-item/job-item.component';
import { JobFilterPipe } from './pipes/job-filter.pipe';
import { LoginComponent } from './components/login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    JobListComponent,
    JobDetailComponent,
    CompanyProfileComponent,
    UserProfileComponent,
    JobItemComponent,
    JobFilterPipe,
    LoginComponent // Custom pipe to filter jobs
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,    // Enables HTTP API calls
    ReactiveFormsModule, // Enables Reactive Forms
    FormsModule          // Enables Template-driven Forms
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
