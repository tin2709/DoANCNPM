import { useEffect, useState } from 'react'
import { fetchProducts } from '../api/products.api'
import { Product } from '../types/product'

const ProductList = () => {
  const [products, setProducts] = useState<Product[]>([])

  useEffect(() => {
    const getProducts = async () => {
      const products = await fetchProducts()
      setProducts(products)
    }
    getProducts()
  }, [])

  return (
    <div className='max-w-5xl mx-auto p-6 bg-gray-50 min-h-screen'>
      <h1 className='text-3xl font-bold mb-6 text-center text-gray-800'>Product List</h1>
      <ul className='grid grid-cols-1 md:grid-cols-2 gap-6'>
        {products.map((product) => (
          <li
            key={product.id}
            className='bg-white p-6 border border-gray-200 rounded-lg shadow hover:shadow-xl transition transform hover:-translate-y-1'
          >
            <h2 className='text-2xl font-semibold mb-2 text-gray-700'>{product.name}</h2>
            <p className='text-gray-600 mb-4'>{product.description}</p>
            <p className='text-blue-600 font-medium text-lg'>${product.price}</p>
          </li>
        ))}
      </ul>
    </div>
  )
}

export default ProductList
