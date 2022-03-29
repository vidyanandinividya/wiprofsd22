var song = /** @class */ (function () {
    function song(title, singer, album) {
        this.title = title;
        this.singer = singer;
        this.album = album;
    }
    song.prototype.getSongs = function () {
        return "Title:".concat(this.title, "\nSinger:").concat(this.singer, "\nalbum:").concat(this.album);
    };
    return song;
}());
var song1 = new song("title1", "singer1", "album1");
var song2 = new song("title2", "singer2", "album3");
var song3 = new song("title2", "singer2", "album3");
var songs = [song1, song2, song3];
songs.forEach(function (s) {
    console.log(s.getSongs());
});
