// src/app/services/auth.service.ts
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, of, throwError } from 'rxjs';
import { delay, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private loggedInSubject: BehaviorSubject<boolean> = new BehaviorSubject<boolean>(!!localStorage.getItem('token'));
  public isLoggedIn$: Observable<boolean> = this.loggedInSubject.asObservable();

  constructor() { }

  /**
   * Simulate a login API call.
   * For demo purposes, the correct credentials are:
   * Email: test@test.com
   * Password: password
   */
  login(email: string, password: string): Observable<boolean> {
    if (email === 'amudheswaran@gmail.com' && password === '1234') {
      return of(true).pipe(
        delay(1000),
        tap(() => {
          // On successful login, store a token and update the BehaviorSubject.
          localStorage.setItem('token', 'dummy-token');
          this.loggedInSubject.next(true);
        })
      );
    } else {
      return throwError('Invalid credentials').pipe(delay(1000));
    }
  }

  logout(): void {
    localStorage.removeItem('token');
    this.loggedInSubject.next(false);
  }
}
