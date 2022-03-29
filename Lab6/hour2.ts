class song
{
  private title:string;
  private  singer:string;
    private album:string;
   constructor(title:string,singer:string,album:string)
   {
       this.title=title;
       this.singer=singer;
       this.album=album;
   }
   getSongs()
   {
       return `Title:${this.title}\nSinger:${this.singer}\nalbum:${this.album}`;
   }
}
const song1=new song("title1","singer1","album1");
const song2=new song("title2","singer2","album3");
const song3=new song("title2","singer2","album3");
const songs=[song1,song2,song3];
songs.forEach(s=>{
    console.log(s.getSongs());
})

