// vite.config.ts (পুরোটা replace করো বা update করো)
import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

export default defineConfig({
  plugins: [react()],
  server: {
    proxy: {
      '/backend-api': {
        target: 'http://localhost:8080',
        changeOrigin: true,
        secure: false,
        rewrite: (path) => path.replace(/^\/backend-api/, '')  // ← এই লাইনটা যোগ করো বা ঠিক করো
      }
    }
  }
})