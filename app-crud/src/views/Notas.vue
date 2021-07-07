<template>
  <div >

    <HeaderLogged/>
    <Note>

    </Note>



  </div>
</template>

<script>
import Header from '@/components/Header.vue'
import Note from "@/components/Note.vue"
import HeaderLogged from "@/components/HeaderLogged";
export default {
  name: 'Notas',
  components: {
    HeaderLogged,
    Note

  }
}
</script>

<style>

</style>