import { Product } from '../types/product';

export const fetchProducts = async (): Promise<Product[]> => {
  try {
    const response = await fetch('http://localhost:8080/api/products');
    if (!response.ok) {
      throw new Error(`HTTP error! Status: ${response.status}`);
    }
    return await response.json();
  } catch (error) {
    console.error('Error fetching products:', error);
    return [];
  }
};
