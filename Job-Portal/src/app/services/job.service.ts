import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Job } from '../models/job.model'
import { Company } from '../models/company.model'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class JobService {
  // Base URL for the json-server API
  private apiUrl = 'http://localhost:3000';

  constructor(private http: HttpClient) {}

  // Fetch all jobs
  getJobs(): Observable<Job[]> {
    return this.http.get<Job[]>(`${this.apiUrl}/jobs`);
  }

  // Fetch a single job by id
  getJob(id: number): Observable<Job> {
    return this.http.get<Job>(`${this.apiUrl}/jobs/${id}`);
  }

  // Fetch a company by id
  getCompany(id: number): Observable<Company> {
    return this.http.get<Company>(`${this.apiUrl}/companies/${id}`);
  }
  submitApplication(applicationData: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/users`, applicationData);
  }
  
}
