export class Customer {
    CusId?: number;
    name: string;
    age: number;
    gender: string;
    email: string;
    address: string;
    mobile: string;
    products: [
        {
            pid?: number;
            medicineName: string;
            seller: string;
            price: number;
            description: string;
            quantity: number
        }
    ]
}
