import { useEffect, useState } from 'react';

interface LeaderboardEntry {
  id: number;
  userName: string;
  totalScore: number;
  quizzesCompleted: number;
}

function Leaderboard() {
  const [leaderboard, setLeaderboard] = useState<LeaderboardEntry[]>([]);

  useEffect(() => {
    fetch('/backend-api/api/leaderboard')
      .then(res => res.json())
      .then(data => setLeaderboard(data))
      .catch(err => console.error('Leaderboard load failed:', err));
  }, []);

  return (
    <div className="p-8 text-white">
      <h2 className="text-3xl font-bold mb-6 text-center">Leaderboard 🏆</h2>
      {leaderboard.length === 0 ? (
        <p className="text-center">কোনো স্কোর এখনো নেই। প্রথম হও!</p>
      ) : (
        <ul className="space-y-4">
          {leaderboard.map((entry, index) => (
            <li key={entry.id} className="bg-gray-800 p-4 rounded-lg flex justify-between">
              <span>{index + 1}. {entry.userName}</span>
              <span className="text-cyan-400 font-bold">{entry.totalScore} pts</span>
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default Leaderboard;