import { TestBed } from '@angular/core/testing';

import { CustomerimplService } from './customerimpl.service';

describe('CustomerimplService', () => {
  let service: CustomerimplService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CustomerimplService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
