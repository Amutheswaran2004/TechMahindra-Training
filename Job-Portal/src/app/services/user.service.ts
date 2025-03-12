import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../models/user.model'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  // Base URL for the json-server API
  private apiUrl = 'http://localhost:3000';

  constructor(private http: HttpClient) {}

  // Fetch user data by id
  getUser(id: number): Observable<User> {
    return this.http.get<User>(`${this.apiUrl}/users/${id}`);
  }
  updateUser(userId: number, data: any): Observable<User> {
    return this.http.put<User>(`${this.apiUrl}/users/${userId}`, data);
  }
  
}
